package com.dean.factory;

import com.dean.domain.GymMemberUpdateDetails;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GymMemberUpdateDetailsFactoryTest {

    @Test
    public void getGymMemberUpdateDetails() {
        String name="dean";
        String surname="february";

        GymMemberUpdateDetails g = GymMemberUpdateDetailsFactory.getGymMemberUpdateDetails(name,surname);
        System.out.println(g);
        Assert.assertNotNull(g.getName());
    }
}