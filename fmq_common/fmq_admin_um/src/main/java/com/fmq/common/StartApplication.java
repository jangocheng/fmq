package com.fmq.common;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@SpringBootApplication 相当于 @EnableAutoConfiguration + @ComponentScan +其他
public class StartApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartApplication.class, args);
    }
   
}
