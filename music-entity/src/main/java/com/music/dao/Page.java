package com.music.dao;

import java.util.ArrayList;
import java.util.List;

public class Page<T> extends ArrayList<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int pageNum = 0;
	
	private int pageSize = 10;
	
	private int start = 0;
	
	private int end = 0;
	
	private int limit = 10;
	
	private long count = 0;
	
	private int pageResultCount = 0;
	
	private List<T> list;

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

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public int getPageResultCount() {
		return pageResultCount;
	}

	public void setPageResultCount(int pageResultCount) {
		this.pageResultCount = pageResultCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
