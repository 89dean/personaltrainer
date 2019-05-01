package com.dean.factory;

import com.dean.domain.TrainerLogin;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerLoginFactoryTest {

    @Test
    public void getTrainerLogin() {
        String emailAddress="deanfebruary3@gmail.com";
        String password="password";

        TrainerLogin t = TrainerLoginFactory.getTrainerLogin(emailAddress,password);
        System.out.println(t);
        Assert.assertNotNull(t.getPassword());

    }
}