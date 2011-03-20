package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.Security;

public class SecurityDaoImpl extends HibernateDaoSupport implements SecurityDao {

	@Override
	public Security getSecurity(int id) {
		return (Security) getHibernateTemplate().load(Security.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Security> listSecurities() {
		return getHibernateTemplate().find("from Security");
	}

	@Override
	public void saveSecurity(Security security) {
		getHibernateTemplate().saveOrUpdate(security);
	}

}
