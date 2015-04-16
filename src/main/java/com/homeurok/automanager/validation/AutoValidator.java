package com.homeurok.automanager.validation;

import com.homeurok.automanager.domain.Auto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Aleh on 14.04.2015.
 */
@Component
public class AutoValidator implements Validator{

    @Override
    public boolean supports(Class<?> aClass) {
        return Auto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"marka","required.marka","marka is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"vladelec","required.vladelec","vladelec is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"number","required.number","number is required");
    }
}
