package com.fmq.common.config;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

	/**
	 * 登录session key
	 */
	public final static String SESSION_KEY = "user";
	protected Log logger = LogFactory.getLog(this.getClass());

	@Bean
	public SecurityInterceptor getSecurityInterceptor() {
		return new SecurityInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());

		// 排除配置
		addInterceptor.excludePathPatterns("/error");
		addInterceptor.excludePathPatterns("/login**");

		// 拦截配置
		addInterceptor.addPathPatterns("/**");
	}

	/**
	 * spring boot  跨域 Cors
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedMethods("*")
				.allowedOrigins("*")
				.allowedHeaders("*");
		//addMapping：配置可以被跨域的路径，可以任意配置，可以具体到直接请求路径。
		//allowedMethods：允许所有的请求方法访问该跨域资源服务器，如：POST、GET、PUT、DELETE等。
		//allowedOrigins：允许所有的请求域名访问我们的跨域资源，可以固定单条或者多条内容，如："http://www.baidu.com"，只有百度可以访问我们的跨域资源。
		//allowedHeaders：允许所有的请求header访问，可以自定义设置任意请求头信息，如："X-YAUTH-TOKEN"

	}
	
	
	
	private class SecurityInterceptor extends HandlerInterceptorAdapter {

		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {

			HttpSession session = request.getSession();
			if (session.getAttribute(SESSION_KEY) != null) {
				logger.info("登陆的账户  " + session.getAttribute(SESSION_KEY));
				return true;
			} else {
				// 如果未登录跳转登录
				String url = "/login";
				response.sendRedirect(url);
				logger.info("url  " + url);
				return false;
			}
		}
	}
}
