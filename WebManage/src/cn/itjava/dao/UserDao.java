package cn.itjava.dao;

import cn.itjava.domain.User;
import cn.itjava.util.PageModel;

public interface UserDao {
	// ��������¼��Ϣ
	public boolean queryInfo(User user);
	// �����û�����
	public boolean updatePassword(User user, String newpwd);
	// ����û�
	public boolean addUser(User user);
	// ɾ���û�
	public boolean delUser(int id);
	// �����û�
	public boolean updUser(User user, int id);
	// ��ѯ�û�
	public User queUser(int id);
	// ���ط�ҳģ��
	public PageModel pageQueryUsers(int pageNo);
}
