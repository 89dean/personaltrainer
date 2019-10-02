package com.dean.factory;

import com.dean.domain.TrainerRegistration;
import com.dean.util.Misc;

public class TrainerRegistrationFactory {

    public static TrainerRegistration getTrainerRegistartion(String name,String surname,String emailAddress){
        return new TrainerRegistration.Builder().name(name).surname(surname).emailAddress(emailAddress).registrationId(Misc.generateId())
                .build();
    }
}
