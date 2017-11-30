package com.fmq.common.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fmq.common.base.BaseController;
import com.fmq.common.base.CommonVO;
import com.fmq.common.controller.vo.TestDemoVO;

@RestController
@RequestMapping("/demo")
public class TestDemoController extends BaseController{

	 /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8089/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
    @ResponseBody
    public CommonVO getDemo(){
    	logger.info("++++++++++++");
       TestDemoVO vo=new TestDemoVO();
       vo.setId(1);
       vo.setName("Angel");
     	logger.info("++++++++++++"+vo.toString());
       return vo;
    }
	
}
