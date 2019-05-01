package com.dean.factory;

import com.dean.domain.CustomerRegistration;
import com.dean.util.Misc;

public class CustomerRegistrationFactory {

    public static CustomerRegistration getCustomerRegistration(String name,String surname,String emailAddress,String preferedSport){
        return new CustomerRegistration.Builder().name(name).surname(surname).emailAddress(emailAddress).prferedSport(preferedSport).id(Misc.generateId())
                .build();
    }
}
