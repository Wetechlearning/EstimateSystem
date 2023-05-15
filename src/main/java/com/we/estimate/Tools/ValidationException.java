package com.we.estimate.Tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ValidationException extends Exception {
    private Map<String, String> errorMessages;

    public ValidationException(Map<String, String> errorMessages) {
        super();
        this.errorMessages = errorMessages;
    }

    public Map<String, String> getErrorMessages() {
        return errorMessages;
    }

    public void resetErrorMessages() {
        this.errorMessages = new HashMap<>();
    }

    private String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public void checkNullOrEmpty(Object checkingObj,
                                 String[] checkingKeys,
                                 Map<String, Map<String, String>> errorMap) throws ValidationException {
        resetErrorMessages();

        boolean isNullOrEmpty = false;

        for (String key : checkingKeys) {
            try {
                Method getterMethod = checkingObj.getClass().getMethod("get" + capitalizeFirstLetter(key));
                Object propertyValue = getterMethod.invoke(checkingObj);

                if (propertyValue == null || propertyValue.toString().isEmpty()) {
                    String error = errorMap.get(key).get("isEmptyError");

                    errorMessages.put(key, error);

                    isNullOrEmpty = true;

                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

        }

        if (isNullOrEmpty) {
            throw new ValidationException(errorMessages); // または String.valueOf(errorMessage);
        }


    }

}
