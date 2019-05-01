package com.dean.factory;

import com.dean.domain.GymMemberLogin;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GymMemberLoginFactoryTest {

    @Test
    public void getGymMemberLogin() {
        String emailAddress="dean.february3@gmail.com";
        String password="password";

        GymMemberLogin g = GymMemberLoginFactory.getGymMemberLogin(emailAddress,password);
        System.out.println(g);
        Assert.assertNotNull(g.getPassword());
    }
}