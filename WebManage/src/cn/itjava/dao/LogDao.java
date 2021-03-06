package cn.itjava.dao;

import java.util.Date;
import java.util.List;

import cn.itjava.domain.Log;
import cn.itjava.util.PageModel;

public interface LogDao {
	
	public void insertRecord(Log log);

	public PageModel pageLog(String name, int pageNo);
	
	public List<Log> searchByDate(String name, Date d1, Date d2);
}
