package com.rokon.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rokon.domain.ContactUs;

public class ContactUsValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {

		return ContactUs.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName",
		"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName",
		"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
		"Field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "text",
		"Field.required");
		
		ContactUs contactUs = (ContactUs) target;
	}

}
