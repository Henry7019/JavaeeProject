package cn.itjava.service;

import cn.itjava.domain.User;
import cn.itjava.util.PageModel;

public interface UserService {
	// ��������¼��Ϣ�������û��ȼ�
	public int searchInfo(User user);

	// �޸�����
	public boolean modifyPassword(User user, String newpwd);

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
