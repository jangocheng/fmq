package com.fmq.common.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.base.BaseController;



@RestController 
@RequestMapping("/log")  
public class LogController extends BaseController{  
      
    @RequestMapping("/writelog")  
    public Object writeLog()  
    {  
        logger.debug("This is a debug message");  
        logger.info("This is an info message");  
        logger.warn("This is a warn message");  
        logger.error("This is an error message");  
        this.helpMethod();
        return "OK";  
    }  
    
    public void helpMethod(){  
        logger.debug("This is a debug message");  
        logger.info("This is an info message");  
        logger.warn("This is a warn message");  
        logger.error("This is an error message");  
    }  
}  
