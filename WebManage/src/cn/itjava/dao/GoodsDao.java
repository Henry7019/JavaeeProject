package cn.itjava.dao;

import java.util.List;

import cn.itjava.domain.Goods;
import cn.itjava.util.PageModel;

public interface GoodsDao {
	// ������
	public boolean addGoods(Goods goods);

	// ɾ���������
	public boolean deleteGoods(int id);

	// ����ɾ�����
	public boolean deleteGoods(int[] ids);

	// �������
	public boolean updateGoods(Goods goods, int id);

	// ��ѯ���
	public Goods queryGoods(int id);

	// ���ط�ҳģ��
	public PageModel pageQueryGoods(String str, int pageNo);
	
	 public List<Goods> getGoodsList();
}
