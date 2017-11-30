package com.fmq.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 * @author ljg
 *
 */
@SpringBootApplication
// @SpringBootApplication 相当于 @EnableAutoConfiguration + @ComponentScan +其他
public class StartApplication {
	public static void main(String[] args) throws Exception {
		Logger logger = LoggerFactory.getLogger(StartApplication.class);
		logger.info(">>>>> StartApplication 正在启动 <<<<<");
		SpringApplication.run(StartApplication.class, args);
		logger.info(">>>>> StartApplication 启动完成 <<<<<");
	}

}
