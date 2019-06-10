package com.dean.factory;

import com.dean.domain.GymMemeberRegistration;
import com.dean.util.Misc;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GymMemberRegistrationFactoryTest {

    @Test
    public void getGymMemberRegistartion() {
        String name="dean";
        String surname="february";
        String emailAddress="dean.february3@gmail.com";
        String preferedSport="Soccer";



        GymMemeberRegistration g = GymMemberRegistrationFactory.getGymMemberRegistartion(name,surname,emailAddress,preferedSport);
        System.out.println(g);
        Assert.assertNotNull(g.getPreferdSport());
    }
}