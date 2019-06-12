package com.dean.factory;

import com.dean.domain.GymMemberRegistration;
import org.junit.Assert;
import org.junit.Test;

public class GymMemberRegistrationFactoryTest {

    @Test
    public void getGymMemberRegistartion() {
        String name="dean";
        String surname="february";
        String emailAddress="dean.february3@gmail.com";
        String preferedSport="Soccer";



        GymMemberRegistration g = GymMemberRegistrationFactory.getGymMemberRegistartion(name,surname,emailAddress,preferedSport);
        System.out.println(g);
        Assert.assertNotNull(g.getPreferdSport());
    }
}