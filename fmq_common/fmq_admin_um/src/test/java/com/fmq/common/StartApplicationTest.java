package com.fmq.common;


import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fmq.common.base.BaseTest;

import junit.framework.TestCase;
/**
 * 
 * @author ljg
 *
 */
@SpringBootTest(classes=StartApplication.class)
@WebAppConfiguration
public class StartApplicationTest extends BaseTest{
	/**
	 * 这两种注解都可以用
	 */
	@Resource
	private com.fmq.common.demo.DemoController testController; 
	
	@Test
	public void homeTest() {
		TestCase.assertEquals(this.testController.home(), "www.baidu.com");
	}
}
