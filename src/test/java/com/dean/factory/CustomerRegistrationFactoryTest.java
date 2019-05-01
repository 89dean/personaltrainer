package com.dean.factory;

import com.dean.domain.CustomerRegistration;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerRegistrationFactoryTest {

    @Test
    public void getCustomerRegistration() {
        String name="dean";
        String surname="february";
        String emailAddress="dean.february3@gmail.com";
        String preferedSport="Running";

        CustomerRegistration c = CustomerRegistrationFactory.getCustomerRegistration(name,surname,emailAddress,preferedSport);
        System.out.println(c);
        Assert.assertNotNull(c.getPreferdSport());
    }
}