package com.dean.factory;

import com.dean.domain.CoachLogin;
import com.dean.util.Misc;

public class CoachLoginFactory {

    public static CoachLogin getCoachlogin(String name,String surname,String emailAddress,String password){
        return new CoachLogin.Builder()
                .name(name)
                .surname(surname)
                .emailAddress(emailAddress)
                .password(password)
                .build();
    }
}
