//package com.example.demo.Collection;
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
////@MapperScan("com.example.demo")
//public class WeixinCollection {
//
//    @Autowired
//    public WeixinDAO weixinDAO;
//
//    private static Logger logger=LoggerFactory.getLogger(WeixinCollection.class);
//
//    @RequestMapping(value = "/select",method = RequestMethod.GET)
//    public List<Weixin> selectall()
//    {
////          List<Weixin> list=  weixinDAO.selectAll();
//          List<Weixin> list=  weixinDAO.selectTwo();
//          return list;
//    }
//
//    @RequestMapping(value = "/insert",method = RequestMethod.GET)
//    public List<Weixin> insert()
//    {
//        List<Weixin> list=  weixinDAO.selectTwo();
//        return list;
//    }
//}
