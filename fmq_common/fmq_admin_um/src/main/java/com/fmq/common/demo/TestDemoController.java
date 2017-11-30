package com.fmq.common.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.dto.TestDemo;

@RestController
@RequestMapping("/demo")
public class TestDemoController {

	 /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8089/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
    public TestDemo getDemo(){
       TestDemo demo = new TestDemo();
       demo.setId(1);
       demo.setName("Angel");
       return demo;
    }
	
}
