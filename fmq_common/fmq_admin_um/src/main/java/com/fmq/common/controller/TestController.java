package com.fmq.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springsource.loaded.agent.FalseReturner;
/**
 * 测试Controller
 * @author ljg
 *
 */
@RestController
// @Controller
@SpringBootApplication
public class TestController {
	// http://localhost:8080/echo/message
	@RequestMapping(value = "/echo/{message}", method = RequestMethod.GET)
	public String echo1(@PathVariable("message") String msg) {
		return "echo  " + msg;
	}
	
	/*
	 * 
	 * 默认传值
	 */
	//@RequestMapping(value = "/say", method = RequestMethod.GET)
	@GetMapping("/say")
	public String say(@RequestParam(value="say",required=false ,defaultValue="0") String msg) {
		return "echo  " + msg;
	}
	//http://localhost:8089/mess?msg=1
	//http://localhost:8089/ec?msg=1
	@RequestMapping(value = {"/mess","/ec"}, method = RequestMethod.GET)
	public String echo2(String msg) {
		return "echo  " + msg;
	}
	
	// http://localhost:8080/esa?num=2
	@RequestMapping("/esa")
	public Object nul(int num) {
		return "" + num * 3;
	}
	/**
	 * ip地址0:0:0:0:0:0:0:1
		客户端编码ISO-8859-1
		真实路径/private/var/folders/vg/6_3h_1c935j2qn7s5ck5lmmm0000gn/T/tomcat-docbase.5835212489978454804.8080/
		session0E81293D06C16FDD4798771E76EDB4E6
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping("/objet")///Users/ljg/myapp/workspace/common/
	public String objet(HttpServletRequest req,HttpServletResponse res) {
		System.out.println( "ip地址"+ req.getRemoteAddr());
		System.out.println( "客户端编码"+ res.getCharacterEncoding());
		System.out.println( "真实路径"+ req.getServletContext().getRealPath("/"));
		System.out.println( "session"+ req.getSession().getId());
		
		return "objet" ;
	}

	// http://localhost:8080/echo?msg=echo
	@RequestMapping("/echo")
	public String echo(String msg) {
		return "echo  " + msg;
	}

	// http://localhost:8080/
	@RequestMapping("/")
	// @ResponseBody
	public String home() {
		return "home";
	}
}
