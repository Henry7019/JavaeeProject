package cn.itjava.dao;

import java.util.List;

import cn.itjava.domain.News;
import cn.itjava.util.PageModel;

public interface NewsDao {
	// �������
	public boolean addNews(News news);

	// ɾ����������
	public boolean deleteNews(int id);

	// ����ɾ������
	public boolean deleteNews(int[] ids);

	// ��������
	public boolean updateNews(News news, int id);

	// ��ѯ����
	public News queryNews(int id);

	// ���ط�ҳģ��
	public PageModel pageQueryNews(String name, String str, int pageNo);
	
	public List<News> getNewsList();
}
