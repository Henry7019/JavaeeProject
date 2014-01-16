package cn.itjava.dao;

import java.util.List;

import cn.itjava.domain.GCate;
import cn.itjava.util.PageModel;

public interface GCateDao {
		// ������
		public boolean addGCate(GCate gcate);

		// ɾ���������
		public int deleteGCate(int id);

		// ����ɾ�����
		public int deleteGCate(int[] ids);

		// �������
		public boolean updateGCate(GCate gcate, int id);

		// ��ѯ���
		public GCate queryGCate(int id);

		// ���ط�ҳģ��
		public PageModel pageQueryGCate(String str, int pageNo);
		
		// ����������𼯺ϣ����������Ʒ
		public List<GCate> queryList();
}
