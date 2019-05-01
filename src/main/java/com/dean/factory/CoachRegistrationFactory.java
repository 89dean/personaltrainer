package com.dean.factory;

import com.dean.domain.CoachRegistration;
import com.dean.util.Misc;

public class CoachRegistrationFactory {

    public static CoachRegistration getCoachRegistartion(String name,String surname,String emailAdress){
        return new CoachRegistration.Builder().name(name).surname(surname).emailAddress(emailAdress).id(Misc.generateId())
                .build();
    }
}
