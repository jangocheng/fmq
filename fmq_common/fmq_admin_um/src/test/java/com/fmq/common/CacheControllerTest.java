package com.fmq.common;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fmq.common.base.BaseTest;

/**
 * 
 * @author ljg
 *
 */
@SpringBootTest(classes=StartApplication.class)
@WebAppConfiguration
public class CacheControllerTest extends BaseTest{

    @Autowired
    private StringRedisTemplate redis;

    @Test
    public void test() throws Exception {
    	
    	
   
    }
    
  
}
