package com.fmq.common;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


//@EnableAutoConfiguration
@SpringBootApplication
//@SpringBootApplication 相当于 @EnableAutoConfiguration + @ComponentScan 
public class StartApplication {

   
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartApplication.class, args);
    }
   
}
