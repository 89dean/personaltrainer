package com.dean.factory;

import com.dean.domain.GymMemberRegistration;
import com.dean.util.Misc;

public class GymMemberRegistrationFactory {

    public static GymMemberRegistration getGymMemberRegistartion(String name, String surname, String emailAdress, String preferedSport){
        return new GymMemberRegistration.Builder().name(name).surname(surname).emailAddress(emailAdress).preferedSport(preferedSport).id(Misc.generateId())
                .build();
    }
}
