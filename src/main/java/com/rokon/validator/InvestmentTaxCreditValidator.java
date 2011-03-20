package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rokon.domain.InvestmentTaxCredit;

public class InvestmentTaxCreditValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return InvestmentTaxCredit.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

	}

}
