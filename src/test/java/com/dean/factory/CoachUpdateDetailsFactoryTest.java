package com.dean.factory;

import com.dean.domain.CoachUpdateDetails;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoachUpdateDetailsFactoryTest {

    @Test
    public void getCoachUpdateDetails() {
        String name="dean";
        String surname="february";

        CoachUpdateDetails c = CoachUpdateDetailsFactory.getCoachUpdateDetails(name,surname);
        System.out.println(c);
        Assert.assertNotNull(c.getName());
    }
}