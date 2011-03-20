package com.rokon.service;


import com.rokon.dao.UserDao;
import com.rokon.domain.User;

public class UserServiceImpl implements UserService {
	UserDao userInfoDao;

	public void setUserInfoDao(UserDao userInfoDao) {
		this.userInfoDao = userInfoDao;
		//System.out.println("User info addess successfully1 ");
	}

	@Override
	public void add(User user) {
		userInfoDao.saveUserInfo(user);
		//System.out.println("User info addess successfully");
	}

	@Override
	public User getUser(int id) {
		return userInfoDao.getUser(id);
	}
}
