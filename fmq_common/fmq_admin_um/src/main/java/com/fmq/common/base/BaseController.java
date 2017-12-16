package com.fmq.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ljg
 *	2017年12月16日
 */
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
