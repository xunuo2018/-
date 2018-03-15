package service;

import java.util.List;
import util.PageUtil;
import entity.Provider;

public interface ProviderService {
	public PageUtil<Provider> checkAllByPage(int pageNo,int pageSize); //��ҳ�鿴����
	public Provider findByPid(int Pid); //��Id��ѯ
	public int addProvider(Provider prov); //����
	public int deleteProvider(int Pid); //ɾ��
	public int updateProvider(Provider prov); //�޸�
	public List<Provider> findByProperties(Provider prov);
	public int getCount(); //������
	public Provider findByProCode(String proCode);
}
