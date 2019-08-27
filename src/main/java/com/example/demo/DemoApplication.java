package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.logging.Logger;

@SpringBootApplication
@EnableScheduling
@EnableSwagger2
//@ComponentScan("com.example.demo.DAO")
//@MapperScan("com.example.demo.DAO")
public class DemoApplication {
//    protected static final Logger logger = LoggerFactory.getLogger(StudyBootDemoApplication.class);
static final Logger logger=Logger.getLogger("main进程");

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("启动输出+++++++++");
    }
}
