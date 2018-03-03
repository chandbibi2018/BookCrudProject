package edu.bookcrudproject.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import edu.bookcrudproject.model.Book;



@Component
public class NameContainsValidator implements ConstraintValidator<NameContains, Book> {

	String substring;

	@Override
	public void initialize(NameContains constraintAnnotation) {
		this.substring=constraintAnnotation.substring();		
	}

	@Override
	public boolean isValid(Book value, ConstraintValidatorContext context) {
		System.out.println("in validator:"+ value.getName().contains(substring));
		return value.getName().contains(substring);
	}

	
	

}
