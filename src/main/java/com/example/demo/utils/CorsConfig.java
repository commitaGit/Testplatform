package com.example.demo.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *   解决全端跨域问题
 */

@Configuration
public class CorsConfig extends WebMvcConfigurerAdapter {

    @Override  
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT")  
                .maxAge(3600);  
    }

    /**
     *     see跨域代码
     *     @Configuration
     * public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
     * 	@Value("${deploy.env}")
     * 	private String env;
     *
     * 	@Override
     * 	public void addInterceptors(InterceptorRegistry registry) {
     * 		// 只在非正式环境开启mock拦截器
     * 		if (!"prod".equals(env)) {
     * 			    registry.addInterceptor(new MockInterceptor()).addPathPatterns("/**");
     * 			if(env.equals("dev")||env.equals("test")){
     * 				//registry.addInterceptor(new RequestLogInterceptor()).addPathPatterns("/platform/**");
     * 			}
     * 		}
     * 		super.addInterceptors(registry);
     * 	}
     * }
     */
}