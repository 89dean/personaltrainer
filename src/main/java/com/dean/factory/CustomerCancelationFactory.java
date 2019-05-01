package com.dean.factory;

import com.dean.domain.CustomerCancelation;

public class CustomerCancelationFactory {

    public static CustomerCancelation getCustomerCancelation(String name,String surname,String cancelMessage){
        return new CustomerCancelation.Builder().name(name).surname(surname).cancelMessage(cancelMessage)
                .build();

    }
}
