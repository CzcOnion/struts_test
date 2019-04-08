package com.org.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class SecurityCodeValidator extends FieldValidatorSupport {
    private String sessionSecurityCode;
    private boolean trim = true;

    public String getSessionSecurityCode() {
        return sessionSecurityCode;
    }

    public void setSessionSecurityCode(String sessionSecurityCode) {
        this.sessionSecurityCode = sessionSecurityCode;
    }

    @Override
    public void validate(Object o) throws ValidationException {
        System.out.println(o);
        Object objSecurityCode = getFieldValue(sessionSecurityCode,o);
        System.out.println(sessionSecurityCode);
        System.out.println(objSecurityCode);
        String fieldName = getFieldName();
        System.out.println(fieldName);
        String fieldValue = (String)getFieldValue(fieldName,o);
        System.out.println(fieldValue);
        if(fieldName == null)
            return;
        if(trim)
            fieldValue = fieldValue.trim();
        if(fieldValue.length() == 0)
            return;
        if(!fieldValue.equals(objSecurityCode))
            addFieldError(fieldName,o);
    }
}
