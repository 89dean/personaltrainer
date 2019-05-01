package com.dean.factory;

import com.dean.domain.CustomerLogin;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerLoginFactoryTest {

    @Test
    public void getCustomerLogin() {
        String emailAdress="dean.februry3@gmail.com";
        String password = "password";

        CustomerLogin c = CustomerLoginFactory.getCustomerLogin(emailAdress,password);
        System.out.println(c);
        Assert.assertNotNull(c.getEmailAddress());
    }
}