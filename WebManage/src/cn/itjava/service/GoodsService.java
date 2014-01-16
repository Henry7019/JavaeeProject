package cn.itjava.service;

import java.util.List;

import cn.itjava.domain.Goods;
import cn.itjava.util.PageModel;

public interface GoodsService {

	// ������
	public boolean addGoods(Goods goods);

	// ɾ���������
	public boolean delGoods(int id);

	// ����ɾ�����
	public boolean delGoods(int[] ids);

	// �������
	public boolean updGoods(Goods goods, int id);

	// ��ѯ���
	public Goods queGoods(int id);

	// ���ط�ҳģ��
	public PageModel pageGoods(String str, int pageNo);
	
	public List<Goods> getGoodsList();
}
