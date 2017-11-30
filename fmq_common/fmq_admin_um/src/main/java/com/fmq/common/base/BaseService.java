package com.fmq.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseService {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public BaseService() {}
	
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
