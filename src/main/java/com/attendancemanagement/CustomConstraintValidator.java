package com.attendancemanagement;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomConstraintValidator implements ConstraintValidator<CustomConstraint, String> {
    
    List<String> customConstraints = Arrays.asList(
        "Yes", "No"
    );
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String string : customConstraints) {
            if (value.equals(string)) return true;
        }
        return false;
    }
}
