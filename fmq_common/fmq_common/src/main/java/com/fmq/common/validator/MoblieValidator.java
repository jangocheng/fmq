package com.fmq.common.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证手机号码
 * @author ljg
 *
 */
public class MoblieValidator {
	//手机号码正则表达式
	public static final String PATTERRN="^[1][3,4,5,7,8][0-9] {9}$";
	/**
	 * 手机号码
	 * @param str
	 * @return 验证通过返回 true
	 */
	public static boolean isMobile(String str) {
		Pattern p=null;
		Matcher m=null;
		boolean b=false;
		p=Pattern.compile(PATTERRN);
		m=p.matcher(str);
		b=m.matches();
		return b;
		
	}

}
