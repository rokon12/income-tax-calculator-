package com.rokon.dao;

import java.util.List;

import com.rokon.domain.BusinessOrProfessional;

public interface BusinessOrProfessionalDao {

	public BusinessOrProfessional getBusinessOrProfessional(int id);

	public void saveBusinessOrProfessional(BusinessOrProfessional businessOrProfessional);

	public List<BusinessOrProfessional> businessOrProfessionalsList();
}
