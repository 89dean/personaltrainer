package com.dean.factory;

import com.dean.domain.CoachLogin;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoachLoginFactoryTest {

    @Test
    public void getCoachlogin() {
        String emailAdress="dean.february3@gmail.com";
        String password="password";

        CoachLogin c = CoachLoginFactory.getCoachlogin(emailAdress,password);
        System.out.println(c);
        Assert.assertNotNull(c.getEmailAddress());

    }
}