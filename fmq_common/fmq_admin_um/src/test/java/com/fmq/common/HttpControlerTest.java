package com.fmq.common;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fmq.common.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartApplication.class)
@WebAppConfiguration
public class HttpControlerTest {
	 private MockMvc mvc;
	 @Before
	    public void setUp() throws Exception {
	        mvc = MockMvcBuilders.standaloneSetup( new UserController()).build();
	    }
	    @Test
	    public void findAll() throws Exception {
	    mvc.perform(MockMvcRequestBuilders.get("/user/findAll")
	                .accept(MediaType.APPLICATION_JSON))
	                .andExpect(MockMvcResultMatchers.status().isOk())
	                .andDo(MockMvcResultHandlers.print())
	                .andReturn();
	    }
}
