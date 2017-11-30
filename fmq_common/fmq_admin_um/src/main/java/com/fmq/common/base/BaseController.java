package com.fmq.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
		public BaseController() {}
		protected Logger logger = LoggerFactory.getLogger(this.getClass());

		public Logger getLogger() {
			return logger;
		}

		public void setLogger(Logger logger) {
			this.logger = logger;
		} 
		
		
}
