package com.dean.factory;

import com.dean.domain.CustomerUpdateDetails;
import com.dean.util.Misc;

public class CustomerUpdateDetailsFactory {

    public static CustomerUpdateDetails getCustomerUpdateDetails(String name,String surname){
        return new CustomerUpdateDetails.Builder().name(name).surname(surname).detailsId(Misc.generateId())
                .build();
    }
}
