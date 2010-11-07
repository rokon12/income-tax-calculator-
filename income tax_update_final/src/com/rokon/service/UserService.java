package com.rokon.service;

import com.rokon.domain.User;

public interface UserService {
	public void add(User user);
	public User getUser(int id);
}
