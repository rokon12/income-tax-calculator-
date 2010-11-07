package com.rokon.service;

import com.rokon.dao.LoginDao;
import com.rokon.domain.Login;

public class RegisterServiceImpl implements RegisterService {
	
	private LoginDao loginDao;

	public void register(Login registered) {
		//System.out.println("Resitration successful");
		loginDao.saveUserName(registered);
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
}
