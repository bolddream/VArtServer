package com.cn.mq.service;

import com.cn.mq.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	
	public int addNewUser(String userName);
//	/**
//	 * �����û�ID��ѯ�û���Ϣ
//	 * @param id
//	 * @return
//	 */
//	public User findUserById(int id);
}
