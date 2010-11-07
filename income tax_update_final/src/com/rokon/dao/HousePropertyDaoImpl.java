package com.rokon.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.HouseProperty;

public class HousePropertyDaoImpl extends HibernateDaoSupport implements HousePropertyDao {

	/*HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}*/

	@SuppressWarnings("unchecked")
	@Override
	public List<HouseProperty> HousePropertyList() {
		return getHibernateTemplate().find("from HouseProperty");
	}

	@Override
	public void saveHouseProperty(HouseProperty houseProperty) {
		getHibernateTemplate().saveOrUpdate(houseProperty);
	}

	@Override
	public HouseProperty getHouseProperty(int id) {
		return (HouseProperty)getHibernateTemplate().load(HouseProperty.class, id);
	}

}
