package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.User;

public  class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User getUser(int id) {
		return (User) getHibernateTemplate().load(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUsers() {

		return getHibernateTemplate().find("from User");
	}

	@Override
	public void saveUserInfo(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

	@Override
	public void saveUser(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}
}
