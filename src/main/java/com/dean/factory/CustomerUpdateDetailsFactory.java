package com.dean.factory;

import com.dean.domain.CustomerUpdateDetails;

public class CustomerUpdateDetailsFactory {

    public static CustomerUpdateDetails getCustomerUpdateDetails(String name,String surname){
        return new CustomerUpdateDetails.Builder().name(name).surname(surname)
                .build();
    }
}
