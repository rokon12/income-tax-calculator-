package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.StateOfAssets;

public class StatementOfAssetsDaoImpl extends HibernateDaoSupport implements
		StatementOfAssetsDao {

	/*
	 * HibernateTemplate hibernateTemplate;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.hibernateTemplate = new HibernateTemplate(sessionFactory); }
	 */

	@Override
	public StateOfAssets getStatementOfAssets(int id) {

		return (StateOfAssets) getHibernateTemplate().load(
				StateOfAssets.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StateOfAssets> listStatementOfAssets() {

		return getHibernateTemplate().find("from StateOfAssets");
	}

	@Override
	public void saveStatementOfAssets(StateOfAssets statementOfAssets) {

		getHibernateTemplate().saveOrUpdate(statementOfAssets);
	}

}
