package com.springbuoi5.validation;

import com.springbuoi5.validation.impl.BirthdayValidator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = BirthdayValidator.class)
@Documented
public @interface Birthday {
    String message() default "Birthday is invalid!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
