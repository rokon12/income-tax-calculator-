package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.BusinessOrProfessional;

public class BusinessOrProfessionalDaoImpl extends HibernateDaoSupport implements
		BusinessOrProfessionalDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<BusinessOrProfessional> businessOrProfessionalsList() {

		return getHibernateTemplate().find("from BusinessOrProfessional");
	}

	@Override
	public BusinessOrProfessional getBusinessOrProfessional(int id) {

		return (BusinessOrProfessional) getHibernateTemplate().load(BusinessOrProfessional.class,
				id);
	}

	@Override
	public void saveBusinessOrProfessional(BusinessOrProfessional businessOrProfessional) {
		getHibernateTemplate().saveOrUpdate(businessOrProfessional);

	}

}
