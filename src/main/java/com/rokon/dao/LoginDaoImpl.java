package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.Login;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {
	@SuppressWarnings("unchecked")
	@Override
	public List listLogin() {
		return getHibernateTemplate().find("from Login");
	}
	
	@SuppressWarnings("unchecked")
	public Login getLogin(String userName, String password) {
		List<Login>  logins = getHibernateTemplate().find("from Login where username=? and password=?", 
					new Object[] {userName, password});
		if (logins != null && logins.size() > 0) {
			return logins.get(0);
		}
		return null;
	}

	@Override
	public void saveUserName(Login login) {
		getHibernateTemplate().saveOrUpdate(login);
	}

	@Override
	public Login getLogin(int id) {
		return (Login) getHibernateTemplate().load(Login.class, id);
	}

}
