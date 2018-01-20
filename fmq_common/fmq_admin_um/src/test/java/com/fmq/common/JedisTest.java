package com.fmq.common;


import redis.clients.jedis.Jedis;
/**
 * 测试连接redis是否成功
 * @author ljg
 *	2018年1月20日
 */
public class JedisTest {
	public static void main(String[] args) {
		
		Jedis jedis=new Jedis("192.168.1.131",6379);
		jedis.set("name","tom");
		String value=jedis.get("name");
		System.out.println(value);
		jedis.close();
	}
}