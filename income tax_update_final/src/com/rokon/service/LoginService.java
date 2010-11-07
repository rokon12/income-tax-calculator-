package com.rokon.service;

import com.rokon.domain.Login;

public interface LoginService {
	public void login(Login login);
	

	public Login getLogin(String username, String password);

}
