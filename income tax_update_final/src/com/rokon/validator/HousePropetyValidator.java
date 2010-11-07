package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rokon.domain.HouseProperty;

public class HousePropetyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return HouseProperty.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rentalincome",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "repair",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "municipal",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lendrev",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,
				"int_loan_or_mortgaze", "Field.required");

		HouseProperty houseProperty = (HouseProperty) target;
	}

}
