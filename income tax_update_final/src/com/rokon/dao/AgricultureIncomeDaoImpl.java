package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.AgricultureIncome;

public class AgricultureIncomeDaoImpl extends HibernateDaoSupport implements
		AgricultureIncomeDao {

	@Override
	public void saveAgricultureIncome(AgricultureIncome agricultureIncome) {
		getHibernateTemplate().saveOrUpdate(agricultureIncome);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AgricultureIncome> agrList() {

		return getHibernateTemplate().find("from AgricultureIncome");
	}

	@Override
	public AgricultureIncome getAgricultureIncome(int id) {

		return (AgricultureIncome) getHibernateTemplate().load(AgricultureIncome.class, id);
	}

}
