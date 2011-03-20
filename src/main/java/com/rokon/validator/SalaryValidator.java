package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rokon.domain.Salary;

public class SalaryValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Salary.class.isAssignableFrom(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "basicpay",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dearall",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "convyall",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "houserent",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mediall",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "serall",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "leaveall",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "honorium",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "overtime",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "entertainment",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bonus",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "providentcontri",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prvidentaccrud",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "trancfacility",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "others",
				"Field.required");
		Salary salary = (Salary) target;
	}

}
