package com.ust.calc.calculadora.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ust.calc.calculadora.annotations.ContactNumberConstraint;

public class ContactNumberValidator implements
  ConstraintValidator<ContactNumberConstraint, String> {
 
    @Override
    public void initialize(ContactNumberConstraint contactNumber) {
    }
 
    @Override
    public boolean isValid(String contactField,
      ConstraintValidatorContext cxt) {
    	if (contactField==null || contactField.isEmpty())
    		return true;
        return contactField.matches("[0-9]{9}")
          && (contactField.length() > 8) && (contactField.length() < 14);
    }
 
}