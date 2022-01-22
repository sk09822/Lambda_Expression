package com.blz.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void firstName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.firstName("Manish");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void lastName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.lastName("Kumar");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void email_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.email("mkaubr007@gmail.com");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void phoneNumber_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.phoneNumber("+918002695700");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void password_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.password("qw1rt@Ms");
        Assertions.assertTrue(actualResult);
    }
}

