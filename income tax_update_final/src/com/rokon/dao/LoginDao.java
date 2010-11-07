package com.rokon.dao;

import java.util.List;

import com.rokon.domain.Login;

public interface LoginDao {
	public Login getLogin(int id);
	
	public Login getLogin(String userName, String password);

	public void saveUserName(Login login);

	@SuppressWarnings("unchecked")
	public List listLogin();
}
