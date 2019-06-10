package com.dean.factory;

import com.dean.domain.CoachAcceptance;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoachAcceptanceFactoryTest {

    @Test
    public void getCoachAcceptance() {
        String name="Dean";
        String surname="February";
        String message="Booking confirmed";

        CoachAcceptance c = CoachAcceptanceFactory.getCoachAcceptance(name,surname,message);
        System.out.println(c);
        Assert.assertNotNull(c.getName());
    }
}