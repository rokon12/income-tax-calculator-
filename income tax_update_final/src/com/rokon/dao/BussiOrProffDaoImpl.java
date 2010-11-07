package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.BussiOrProff;

public class BussiOrProffDaoImpl extends HibernateDaoSupport implements
		BussiOrProffDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<BussiOrProff> bussiOrProffsList() {

		return getHibernateTemplate().find("from BussiOrProff");
	}

	@Override
	public BussiOrProff getBussiOrProff(int id) {

		return (BussiOrProff) getHibernateTemplate().load(BussiOrProff.class,
				id);
	}

	@Override
	public void saveBussiOrProff(BussiOrProff bussiOrProff) {
		getHibernateTemplate().saveOrUpdate(bussiOrProff);

	}

}
