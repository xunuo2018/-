package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import entity.Bill;

public interface BillDao {
	public List<Bill> checkAllByPage(@Param("index")int pageNo,@Param("pageSize")int pageSize); //�鿴����
	public Bill findByBId(int Bid); //��Id��ѯ
	public int addBill(Bill bill); //����
	public int deleteBill(int Bid); //ɾ��
	public int updateBill(Bill bill); //�޸�
	public List<Bill> findByProperties(@Param("bill")Bill bill);
	public int getCount();
	public List<Bill> checkProName();//�鹩Ӧ����
}
