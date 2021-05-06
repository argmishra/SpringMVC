package com.springmvc.validation;

import javax.validation.ConstraintValidator;  
import javax.validation.ConstraintValidatorContext;  
  
public class KeyValidator implements ConstraintValidator<Key,String> {  
  
    public boolean isValid(String s, ConstraintValidatorContext cvc) {  
          
        boolean result=s.startsWith("arg");  
        return result;  
    }  
}  