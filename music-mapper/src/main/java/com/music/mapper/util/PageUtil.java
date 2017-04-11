package com.music.mapper.util;

import com.music.dao.Page;

public class PageUtil {

	/**
	 * 分页区间
	 * @param pagesLen
	 * @param page
	 * @return
	 */
	public <T> Page<T> getPageInterval(Page<T> page){
		int start = 0;
		int end = 0;
		int pagesLen = 0;
		int count = (int)page.getCount(); 
		int pageNum = page.getPageNum();
		if(count == 0){
			start = 0;
		}else{
			pagesLen = getCount(count,page.getPageSize());
			if(pagesLen < 8){
				start = 1;
				end = pagesLen;
			}else{
				if(pageNum <= 4){
					start = 1;
					end = 8;
				}else if(pageNum >= pagesLen - 4){
					end = pagesLen;
					start = pagesLen - 7;
				}else{
					start = pageNum -4;
					end = pageNum + 3;
				}
			}
		}
		page.setStart(start);
		page.setEnd(end);
		return page;
	}
	
	private int getCount(int count,int pageSize){
		if(count % pageSize ==0){
			return count / pageSize;
		}else{
			return count / pageSize + 1;
		}
	}

}
