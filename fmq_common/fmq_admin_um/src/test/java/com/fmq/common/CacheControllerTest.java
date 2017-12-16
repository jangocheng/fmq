package com.fmq.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * 
 * @author ljg
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartApplication.class)
@WebAppConfiguration
public class CacheControllerTest {

    @Autowired
    private StringRedisTemplate redis;

    @Test
    public void test() throws Exception {
    	
    	
   
    }
    
  
}
