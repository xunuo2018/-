package service;

import java.util.List;
import util.PageUtil;
import entity.Bill;

public interface BillService {
	public PageUtil<Bill> checkAllByPage(int pageNo,int pageSize);; //�鿴����
	public Bill findByBId(int Bid); //��Id��ѯ
	public int addBill(Bill bill); //����
	public int deleteBill(int Bid); //ɾ��
	public int updateBill(Bill bill); //�޸�
	public List<Bill> findByProperties(Bill bill);
	public List<Bill> checkProName();
}
