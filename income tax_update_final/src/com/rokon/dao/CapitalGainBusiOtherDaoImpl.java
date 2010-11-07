package com.rokon.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rokon.domain.CapitalGainBusiOther;

public class CapitalGainBusiOtherDaoImpl extends HibernateDaoSupport implements
		CapitalGainBusiOtherDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<CapitalGainBusiOther> cGainBusiOthersList() {

		return getHibernateTemplate().find("from CapitalGainBusiOtherDao");
	}

	@Override
	public CapitalGainBusiOther getCapitalGainBusiOther(int id) {
		return (CapitalGainBusiOther) getHibernateTemplate().load(
				CapitalGainBusiOther.class, id);
	}

	@Override
	public void saveCapitalGainBusiOther(
			CapitalGainBusiOther capitalGainBusiOther) {
		getHibernateTemplate().saveOrUpdate(CapitalGainBusiOther.class);

	}

}
