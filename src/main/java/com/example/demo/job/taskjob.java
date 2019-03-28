//package com.example.demo.job;
//
//import org.apache.ibatis.annotations.Update;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class taskjob {
//    @Scheduled(cron = "0 0/1 * * * ? ")
//    @Update("update domain.testing_task set state='2' where end_time< now() and state='1'")
//    public void statejob(){
//
//        System.out.print(new Date()+"执行了");
//    }
//
//}
