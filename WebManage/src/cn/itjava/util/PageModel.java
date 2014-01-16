package cn.itjava.util;

import java.util.List;

import cn.itjava.domain.News;

public class PageModel {
	
	
	public PageModel() {}
	
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * �����ҳ��
	 */
	public int getTotalPages(){
		return (totalRecords + pageSize -1 ) / pageSize;
	}    
	/**
	 * ȡ����ҳ
	 */
	public int getTopPageNo(){
		return 1;
	}
	/**
	 * ȡ����һҳ
	 */
	public int getPreviousPageNo(){
		if (pageNo <= 1) {
			return 1;
		}
		return pageNo-1;
	}
	/**
	 * ȡ����һҳ
	 */
	public int getNextPageNo(){
		if(pageNo >= getTotalPages()){
			return getTotalPages()==0 ? 1:getTotalPages();
		}
		return pageNo+1;
	}
	/**
	 * ȡ��βҳ
	 */
	public int getBottomPageNo(){
		return getTotalPages()==0 ? 1:getTotalPages();
	}
	
	/**
	 * �ܼ�¼��
	 */
	private int totalRecords; 
	/**
	 * ÿҳ������ݽ��,�����޷�������News����User
	 */
	private List list;
	/**
	 * ��ǰҳ�ţ�Ĭ��Ϊ1
	 */
	private int pageNo = 1;
	/**
	 * ҳ��ߴ磬Ĭ��Ϊ5
	 */
	private int pageSize = 5;
	
}
