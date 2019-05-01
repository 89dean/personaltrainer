package com.dean.factory;

import com.dean.domain.GymMemberLogin;

public class GymMemberLoginFactory {

    public static GymMemberLogin getGymMemberLogin(String emailAdress,String password){
        return new GymMemberLogin.Builder().emailAddress(emailAdress).password(password)
                .build();
    }
}
