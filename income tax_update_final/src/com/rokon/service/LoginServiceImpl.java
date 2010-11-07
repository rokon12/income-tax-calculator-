package com.rokon.service;

import com.rokon.dao.LoginDao;
import com.rokon.domain.Login;

public class LoginServiceImpl implements LoginService {

	LoginDao loginDao;

	@Override
	public void login(Login login) {
		System.out.println("login success");
	}

	@Override
	public Login getLogin(String userName, String password) {
		/*Login login = new Login();
		login.setUsername(userName);
		login.setPassword(password);
		login.setId(10);
		return login;*/
		return loginDao.getLogin(userName, password);
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}
