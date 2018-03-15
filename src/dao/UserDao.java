package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import entity.User;

public interface UserDao {
	public List<User> checkAllByPage(@Param("index")int pageNo,@Param("pageSize")int pageSize); //��ҳ�鿴����
	public User findByUserId(int userId); //��Id��ѯ�û�
	public int addUser(User user); //�����û�
	public int deleteUser(int userId); //ɾ���û�
	public int updateUser(User user); //�޸��û�
	public User findByUserCodeAndPwd(@Param("userCode")String userCode,@Param("userPassword")String userPassword); //��½
	public int getCount(); //������
	public List<User> findByProperties(@Param("user")User user);
	public int updatePwdById(@Param("userPassword")String password,@Param("userId")int userId);
	public User findByUserCode(String userCode);
}
