package com.fmq.common.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * 
 * @author ljg
 *
 */
public class PasswdValidator {
	/**
	 *  密码策略
	 */
	public static final String PWD_POLICY = "^(?![^a-zA-z]+$)(?!\\D+$).{8,20}$";
	/**
	 * 判断密码是否符合安全要求：8-20位 必须包含字母和数字
	 * @param pwd
	 * @return
	 */
	@Autowired
	public static boolean isPwdMatchPolocy(String pwd) {
		Pattern p=null;
		Matcher m=null;
		boolean b=false;
		p=Pattern.compile(PWD_POLICY);
		m=p.matcher(pwd);
		b=m.matches();
		return b;
		
	}

}
