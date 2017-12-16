package com.fmq.common.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author ljg
 *
 */
@RestController 
@RequestMapping("/logger") 
public class LoggerController {

	protected Log logger = LogFactory.getLog(this.getClass());
	
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
	        logger.debug("helpMethod This is a debug message");  
	        logger.info("helpMethod This is an info message");  
	        logger.warn("helpMethod This is a warn message");  
	        logger.error("helpMethod This is an error message");  
	    }  
	
}
