package com.dean.factory;

import com.dean.domain.TrainerRegistration;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerRegistrationFactoryTest {

    @Test
    public void getTrainerRegistartion() {
        String name="dean";
        String surname="february";
        String emailAddress="dean.february3@gmail.com";

        TrainerRegistration t = TrainerRegistrationFactory.getTrainerRegistartion(name,surname,emailAddress);
        System.out.println(t);
        Assert.assertNotNull(t.getEmailAddress());
    }
}