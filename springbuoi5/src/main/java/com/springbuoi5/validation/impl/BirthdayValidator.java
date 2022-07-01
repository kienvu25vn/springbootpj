package com.springbuoi5.validation.impl;

import com.springbuoi5.validation.Birthday;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayValidator implements ConstraintValidator<Birthday, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(!value.equals("")) {
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(value);
            } catch (ParseException e) {
                return false;
            }
        }
        return true;
    }
}
