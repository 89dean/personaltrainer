package com.dean.factory;

import com.dean.domain.RegistrationForm;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationFormFactoryTest {

    @Test
    public void getRegistrationForm() {

        RegistrationForm r = RegistrationFormFactory.getRegistrationForm("Dean","February","dean.february3@gmail.com","Running");
        System.out.println(r);
        Assert.assertNotNull(r.getName());
    }
}