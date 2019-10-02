package com.dean.factory;

import com.dean.domain.CoachLogin;
import com.dean.util.Misc;

public class    CoachLoginFactory {

    public static CoachLogin getCoachlogin(String emailAdress,String password){
        return new CoachLogin.Builder().emailAddress(emailAdress).password(password).loginId(Misc.generateId())
                .build();
    }
}
