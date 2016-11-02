package com.cn.mq.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.cn.mq.pojo.User;
import com.cn.mq.service.IUserService;
import com.cn.mq.dao.IUserDao;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
//	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	public int addNewUser(String userName) {
		User newUser = new User();
		newUser.setAge(12);
		newUser.setPassword("121221");
		newUser.setUserName(userName);
		return this.userDao.insert(newUser);
	}

//	//@Override
//	public User findUserById(int id) {
//		 User user = this.userDao.selectUserById(id);
//		 return user; 
//	}
}
