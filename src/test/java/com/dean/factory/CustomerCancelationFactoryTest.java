package com.dean.factory;

import com.dean.domain.CustomerCancelation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerCancelationFactoryTest {

    @Test
    public void getCustomerCancelation() {
        String name="dean";
        String surname="february";
        String cancelMessage="Cannot make it";

        CustomerCancelation c = CustomerCancelationFactory.getCustomerCancelation(name,surname,cancelMessage);
        System.out.println(c);
        Assert.assertNotNull(c.getCancelMessage());
    }
}