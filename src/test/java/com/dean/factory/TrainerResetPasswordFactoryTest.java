package com.dean.factory;

import com.dean.domain.TrainerResetPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerResetPasswordFactoryTest {

    @Test
    public void getTrainerResetPassword() {
        String emailAddress="dean.february3@gmail.com";

        TrainerResetPassword t = TrainerResetPasswordFactory.getTrainerResetPassword(emailAddress);
        System.out.println(t);
        Assert.assertNotNull(t.getEmailAddress());
    }
}