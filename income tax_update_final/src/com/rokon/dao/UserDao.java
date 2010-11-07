package com.rokon.dao;

import java.util.List;

import com.rokon.domain.User;

public interface UserDao {

	public User getUser(int id);

	public List<User> listUsers();

	public void saveUser(User user);

	void saveUserInfo(User user);

}
