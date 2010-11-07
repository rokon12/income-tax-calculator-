package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.Salary;

public class SalaryDaoImpl extends HibernateDaoSupport implements SalaryDao {
	/*
	 * HibernateTemplate hibernateTemplate;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.hibernateTemplate = new HibernateTemplate(sessionFactory); }
	 */

	@Override
	public Salary getSalary(int id) {

		return (Salary) getHibernateTemplate().load(Salary.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Salary> listSalaries() {

		return getHibernateTemplate().find("from Salary");
	}

	@Override
	public void saveSalary(Salary salary) {
		getHibernateTemplate().saveOrUpdate(salary);
	}
}
