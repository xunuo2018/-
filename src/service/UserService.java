package service;


import java.util.List;
import util.PageUtil;
import entity.User;

public interface UserService {
	public PageUtil<User> checkAllByPage(int pageNo,int pageSize); //�鿴����
	public User findByUserId(int userId); //��Id��ѯ�û�
	public int addUser(User user); //�����û�
	public int deleteUser(int userId); //ɾ���û�
	public int updateUser(User user); //�޸��û�
	public User findByUserCodeAndPwd(String Code,String userPassword); //��½
	public int getCount();//������
	public List<User> findByProperties(User user);
	public int updatePwdById(String password,int userId);
	public User findByUserCode(String userCode);
}
