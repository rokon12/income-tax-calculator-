package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rokon.domain.AgricultureIncome;

public class AgricultureIncomeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return AgricultureIncome.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,
				"total_amount_of_land", "Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors,
				"production_per_unit", "Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors,
				"market_prize_per_crops", "Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "production_cost",
				"Field.required");

	}
}
