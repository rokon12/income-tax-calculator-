package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.ParticularsOfExpenditure;

public class ParticularsOfExpenditureDaoImp extends HibernateDaoSupport
		implements ParticularsOfExpenditureDao {

	/*
	 * HibernateTemplate hibernateTemplate;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.hibernateTemplate = new HibernateTemplate(sessionFactory); }
	 */

	@Override
	public void saveParticularsOfExpenditure(
			ParticularsOfExpenditure particularsOfExpenditure) {
		getHibernateTemplate().saveOrUpdate(particularsOfExpenditure);

	}

	@Override
	public ParticularsOfExpenditure getParticularsOfExpenditure(int id) {

		return (ParticularsOfExpenditure) getHibernateTemplate().load(
				ParticularsOfExpenditure.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ParticularsOfExpenditure> getParticularsOfExpenditure() {

		return getHibernateTemplate().find("from ParticularsOfExpenditure");
	}

}
