package com.fmq.common.base;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 
 * @author ljg
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {
	
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	
	
	
}
