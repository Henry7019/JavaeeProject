package cn.itjava.domain;

public class GCate {
	
	public GCate() {}
	
	public GCate(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	/**
	 * ��Ʒ���
	 */
	private int id;
	/**
	 * ��Ʒ�������
	 */
	private String name;
}
