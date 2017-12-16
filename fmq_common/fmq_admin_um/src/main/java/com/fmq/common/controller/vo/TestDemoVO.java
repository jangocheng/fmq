package com.fmq.common.controller.vo;
/**
 * 
 * @author ljg
 *
 */
public class TestDemoVO extends CommonVO{

	
	private static final long serialVersionUID = 1L;
	/**
	 *  主键.
	 */
	private Integer id;
	/**
	 * 测试名称.
	 */
	private String name;
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TestDemoVO [id=" + id + ", name=" + name + ", responseCode=" + responseCode + ", responseMsg="
				+ responseMsg + ", getId()=" + getId() + ", getName()=" + getName() + ", getResponseCode()="
				+ getResponseCode() + ", getResponseMsg()=" + getResponseMsg() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
