package com.fmq.common.demo;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.base.BaseController;
import com.fmq.common.dto.TestDemo;

@RestController
@RequestMapping("/demo")
public class TestDemoController extends BaseController{

	 /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8089/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
   // @ResponseBody
    public TestDemo getDemo(){
    	logger.info("++++++++++++");
       TestDemo demo = new TestDemo();
       demo.setId(1);
       demo.setName("Angel");
     	logger.info("++++++++++++"+demo.toString());
       return demo;
    }
	
}
