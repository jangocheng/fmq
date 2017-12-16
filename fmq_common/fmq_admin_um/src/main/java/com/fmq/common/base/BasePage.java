package com.fmq.common.base;

import com.fmq.common.controller.vo.CommonVO;
/**
 * 
 * @author ljg
 *
 */
public class BasePage extends CommonVO{

	private static final long serialVersionUID = 1L;
	
	
	
	public int pageNum;
	public int pageSize;
	
	public BasePage() {}
	public BasePage(int pageNum ,int pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;

	}
	
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

}
