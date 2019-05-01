package com.dean.factory;

import com.dean.domain.GymMemberBookAppointment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GymMemberBookAppointmentFactoryTest {

    @Test
    public void getGymMemberBookAppointment() {
        String name="dean";
        String surname="february";
        String title="Mr";
        String time="10:00am";

        GymMemberBookAppointment g = GymMemberBookAppointmentFactory.getGymMemberBookAppointment(name,surname,title,time);
        System.out.println(g);
        Assert.assertNotNull(g.getTitle());
    }
}