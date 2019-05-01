package com.dean.factory;

import com.dean.domain.CoachLogin;

public class CoachLoginFactory {

    public static CoachLogin getCoachlogin(String emailAdress,String password){
        return new CoachLogin.Builder().emailAddress(emailAdress).password(password)
                .build();
    }
}
