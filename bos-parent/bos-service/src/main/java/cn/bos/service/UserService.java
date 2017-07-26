package cn.bos.service;

import java.util.List;

import cn.bos.domain.user.User;

public interface UserService {
	/**
	 * 根据用户名和密码获取用户
	 * @param email
	 * @param password
	 * @return
	 */
	User findByEmailAndPassword(String email,String  password);
	/**
	 * 更新密码
	 * @param newPwd
	 * @param username
	 */
	void updatePassword(String newPwd, String username);
	/**
	 * 保存或者更新用户
	 * @param user
	 */
	void save(User user);
	/**
	 * 删除用户
	 * @param user
	 */
	 void delete(User user);
	 /**
	  * 根据id获取用户
	  * @param id
	  */
	 void findOne(Integer id);
	 /**
	  * 获取所有用户信息
	  */
	void findAll();
	void updatePasswordByTelephone(String password, String telephone);
	User findUserByTelephone(String telephone);
	 
}
	