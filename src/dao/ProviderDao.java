package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import entity.Provider;


public interface ProviderDao {
	public List<Provider> checkAllByPage(@Param("index")int pageNo,@Param("pageSize")int pageSize); //��ҳ�鿴����
	public Provider findByPid(int Pid); //��Id��ѯ
	public int addProvider(Provider prov); //����
	public int deleteProvider(int Pid); //ɾ��
	public int updateProvider(Provider prov); //�޸�
	public List<Provider> findByProperties(@Param("provider")Provider prov);
	public int getCount(); //������
	public Provider findByProCode(String proCode);
}
