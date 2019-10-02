package com.dean.factory;

import com.dean.domain.CustomerCancelation;
import com.dean.util.Misc;

public class CustomerCancelationFactory {

    public static CustomerCancelation getCustomerCancelation(String name,String surname,String cancelMessage){
        return new CustomerCancelation.Builder().name(name).surname(surname).cancelMessage(cancelMessage).cancelationId(Misc.generateId())
                .build();

    }
}
