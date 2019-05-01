package com.dean.factory;

import com.dean.domain.CoachResetPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoachResetPasswordFactoryTest {

    @Test
    public void getCoachResetPassword() {
        String emailAddress="dean.february3@gmail.com";

        CoachResetPassword c = CoachResetPasswordFactory.getCoachResetPassword(emailAddress);
        System.out.println(c);
        Assert.assertNotNull(c.getEmailAddress());
    }
}