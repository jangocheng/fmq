package com.fmq.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

/**
 * 
 * @author ljg
 *
 */
public class BeanHelper {
	
	private static Logger logger = LoggerFactory.getLogger(BeanHelper.class);
	
	public static void copyProperties(Object source,Object target ,String[] ignoreProperties) {
		try {
			BeanUtils.copyProperties(source, target, ignoreProperties);
			
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
	
	public static void copyProperties(Object source,Object target) {
		try {
			BeanUtils.copyProperties(source, target);
			
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

}
