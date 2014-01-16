package cn.itjava.service;

import java.util.List;

import cn.itjava.domain.GCate;
import cn.itjava.domain.News;
import cn.itjava.util.PageModel;

public interface GCateService {

	// ������
	public boolean addGCate(GCate gcate);

	// ɾ���������
	public int delGCate(int id);

	// ����ɾ�����
	public int delGCate(int[] ids);

	// �������
	public boolean updGCate(GCate gcate, int id);

	// ��ѯ���
	public GCate queGCate(int id);

	// ���ط�ҳģ��
	public PageModel pageGCates(String str, int pageNo);

	// ����������𼯺ϣ����������Ʒ
	public List<GCate> queryList();
}
