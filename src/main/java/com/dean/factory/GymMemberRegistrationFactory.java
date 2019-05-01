package com.dean.factory;

import com.dean.domain.GymMemeberRegistration;
import com.dean.util.Misc;

public class GymMemberRegistrationFactory {

    public static GymMemeberRegistration getGymMemberRegistartion(String name,String surname,String emailAdress,String preferedSport){
        return new GymMemeberRegistration.Builder().name(name).surname(surname).emailAddress(emailAdress).preferedSport(preferedSport).id(Misc.generateId())
                .build();
    }
}
