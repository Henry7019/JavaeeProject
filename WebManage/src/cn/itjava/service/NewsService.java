package cn.itjava.service;

import java.util.List;

import cn.itjava.domain.News;
import cn.itjava.util.PageModel;

public interface NewsService {

	// �������
	public boolean addNews(News news);

	// ɾ����������
	public boolean delNews(int id);

	// ����ɾ������
	public boolean delNews(int[] ids);

	// ��������
	public boolean updNews(News news, int id);

	// ��ѯ����
	public News queNews(int id);

	public List<News> getNewsList();

	// ���ط�ҳģ��
	public PageModel pageNews(String name, String str, int pageNo);
}
