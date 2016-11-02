package com.cn.mq.service;

import com.cn.mq.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	
	public int addNewUser(String userName);
//	/**
//	 * 根据用户ID查询用户信息
//	 * @param id
//	 * @return
//	 */
//	public User findUserById(int id);
}
