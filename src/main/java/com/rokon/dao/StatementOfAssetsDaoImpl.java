package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.StatementOfAssets;

public class StatementOfAssetsDaoImpl extends HibernateDaoSupport implements
		StatementOfAssetsDao {

	/*
	 * HibernateTemplate hibernateTemplate;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.hibernateTemplate = new HibernateTemplate(sessionFactory); }
	 */

	@Override
	public StatementOfAssets getStatementOfAssets(int id) {

		return (StatementOfAssets) getHibernateTemplate().load(
				StatementOfAssets.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StatementOfAssets> listStatementOfAssets() {

		return getHibernateTemplate().find("from StatementOfAssets");
	}

	@Override
	public void saveStatementOfAssets(StatementOfAssets statementOfAssets) {

		getHibernateTemplate().saveOrUpdate(statementOfAssets);
	}

}
