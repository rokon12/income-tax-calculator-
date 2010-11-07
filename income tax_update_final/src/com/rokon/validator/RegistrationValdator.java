package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rokon.domain.Login;

public class RegistrationValdator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return Login.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
				"Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender",
				"Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "street",
				"Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zip_code",
				"Field.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city",
				"Field.required");

	}
}
