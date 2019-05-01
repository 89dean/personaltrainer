package com.dean.factory;

import com.dean.domain.TrainerUpdateDetails;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerUpdateDetailsFactoryTest {

    @Test
    public void getTrainerUpdateDetails() {
        String name="dean";
        String surname="february";

        TrainerUpdateDetails t = TrainerUpdateDetailsFactory.getTrainerUpdateDetails(name,surname);
        System.out.println(t);
        Assert.assertNotNull(t.getName());
    }
}