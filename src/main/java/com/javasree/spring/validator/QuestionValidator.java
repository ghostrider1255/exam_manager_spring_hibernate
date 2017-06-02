package com.javasree.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javasree.spring.model.Question;

@Component
public class QuestionValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Question.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Question question = (Question)target;
		ValidationUtils.rejectIfEmpty(errors, "subjects", "Select At least one Subject");
		if( question.getSubjects().size() == 0)
		{
			errors.rejectValue("subjects", "Subject Rejected");
		}
	}
}
