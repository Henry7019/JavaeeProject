package cn.itjava.domain;

public class Goods {
	
	public Goods() {}
	
	public Goods(int id, String name, GCate gcate, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.gcate = gcate;
		this.desc = desc;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GCate getGcate() {
		return gcate;
	}
	public void setGcate(GCate gcate) {
		this.gcate = gcate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * ��Ʒid
	 */
	private int id;
	/**
	 * ��Ʒ����
	 */
	private String name;
	/**
	 * ��Ʒ���
	 */
	private GCate gcate;
	/**
	 * ��Ʒ����
	 */
	private String desc;
}
