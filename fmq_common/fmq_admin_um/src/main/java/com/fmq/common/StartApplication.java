package com.fmq.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 项目启动类
 * @author ljg
 *
 */
@SpringBootApplication
@EnableWebSecurity
public class StartApplication {
	public static void main(String[] args) throws Exception {
		Logger logger = LoggerFactory.getLogger(StartApplication.class);
		logger.info(">>>>> fmq_admin_um StartApplication 正在启动 <<<<<");
		SpringApplication.run(StartApplication.class, args);
		logger.info(">>>>> fmq_admin_um StartApplication 启动完成 <<<<<");
	}

	private CorsConfiguration buildConfig() {  
        CorsConfiguration corsConfiguration = new CorsConfiguration();  
        corsConfiguration.addAllowedOrigin("*");  
        corsConfiguration.addAllowedHeader("*");  
        corsConfiguration.addAllowedMethod("*");  
        return corsConfiguration;  
    }  
      
    /** 
     * 跨域过滤器 
     * @return 
     */  
    @Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        source.registerCorsConfiguration("/**", buildConfig());  
        return new CorsFilter(source);  
    }  
	
	
	
}
