package cn.itjava.domain;

public class User {
	
	public User() {}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/**
	 * �û�����true ����Ա��false ��ͨ�û�
	 */
	private boolean flag;
	/**
	 * �û����
	 */
	private int id;
	/**
	 * �û���
	 */
	private String name;
	/**
	 * �û�����
	 */
	private String password;
}
