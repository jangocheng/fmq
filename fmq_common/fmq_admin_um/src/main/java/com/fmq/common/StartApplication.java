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
public class StartApplication {
	public static void main(String[] args) throws Exception {
		Logger logger = LoggerFactory.getLogger(StartApplication.class);
		logger.info(">>>>> fmq_admin_um StartApplication 正在启动 <<<<<");
		SpringApplication.run(StartApplication.class, args);
		logger.info(">>>>> fmq_admin_um StartApplication 启动完成 <<<<<");
	}

}
