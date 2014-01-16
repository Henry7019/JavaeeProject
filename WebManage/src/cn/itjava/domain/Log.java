package cn.itjava.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Log {
	
	public Log() {}
	
	public Log(String id, String name, String opera, Timestamp time) {
		super();
		this.id = id;
		this.name = name;
		this.opera = opera;
		this.time = time;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpera() {
		return opera;
	}
	public void setOpera(String opera) {
		this.opera = opera;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	/**
	 * ��־���
	 */
	private String id;
	/**
	 * �û�����
	 */
	private String name;
	/**
	 * ����
	 */
	private String opera;
	/**
	 * ����ʱ�䣬�����Ƿ���oracle���Զ�ȡʱ���룬���Բ���Timestamp����
	 */
	private Timestamp time;
}
