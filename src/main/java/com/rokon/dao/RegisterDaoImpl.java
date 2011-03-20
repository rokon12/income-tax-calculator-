package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.Register;

public class RegisterDaoImpl extends HibernateDaoSupport implements RegisterDao {

	@Override
	public Register getRegister(int id) {

		return (Register) getHibernateTemplate().load(Register.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Register> listRegisters() {

		return getHibernateTemplate().find("from Register");
	}

	@Override
	public void saveRegister(Register register) {
		getHibernateTemplate().saveOrUpdate(register);
	}

}
