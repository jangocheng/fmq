package com.fmq.common.config;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * spring boot Security 权限
 * @author ljg
 *
 */
@Configuration

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true,proxyTargetClass =true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
    @Override
    public void configure(WebSecurity web) throws Exception {
        //忽略css.jq.img等文件
        web.ignoring().antMatchers("/**.html","/**.css", "/img/**", "/**.js","/third-party/**","/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
        			.csrf().disable() //HTTP with Disable CSRF
                .authorizeRequests() //Authorize Request Configuration
                .antMatchers( "/login",
                        "/api/**",
                        "/**/heapdump",
                        "/**/loggers",
                        "/**/liquibase",
                        "/**/logfile",
                        "/**/flyway",
                        "/**/auditevents",
                        "/**/jolokia").permitAll() //放开"/api/**"：为了给被监控端免登录注册并解决Log与Logger冲突
                .and()
                .authorizeRequests()
                .antMatchers("/**").hasRole("USER")
                .antMatchers("/**").authenticated()
                .and() //Login Form configuration for all others
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login").permitAll()
                .defaultSuccessUrl("/")
                .and() //Logout Form configuration
                .logout()
                .deleteCookies("remove")
                .logoutSuccessUrl("/login").permitAll()
                .and()
                .httpBasic();

    }
	
	
}
