package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rokon.domain.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nationalid",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "circle",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "taxeszone",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "asssessment",
				"Field.required");
		ValidationUtils.rejectIfEmpty(errors, "residentialstatus",
				"Field.required");
		ValidationUtils.rejectIfEmpty(errors, "status", "Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nameoftheemployer",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "wiferrhusbandsname",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fathersname",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mothersname",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateofbirth",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "presentaddress",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paradd",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telephoneno",
				"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "vatreginumber",
				"Field.required");

		User user = (User) target;

	}

}
