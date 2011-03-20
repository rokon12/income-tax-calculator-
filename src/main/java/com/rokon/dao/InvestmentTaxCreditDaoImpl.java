package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.InvestmentTaxCredit;

public class InvestmentTaxCreditDaoImpl extends HibernateDaoSupport implements
		InvestmentTaxCreditDao {
	/*
	 * HibernateTemplate hibernateTemplate;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.hibernateTemplate = new HibernateTemplate(sessionFactory); }
	 */

	@Override
	public InvestmentTaxCredit getInvestmentTaxCredit(int id) {

		return (InvestmentTaxCredit) getHibernateTemplate().load(
				InvestmentTaxCredit.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InvestmentTaxCredit> listInvCredits() {

		return getHibernateTemplate().find("from InvestmentTaxCredit");
	}

	@Override
	public void saveInvestmetTaxCredit(InvestmentTaxCredit investmentTaxCredit) {
		getHibernateTemplate().saveOrUpdate(investmentTaxCredit);
	}

}
