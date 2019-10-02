package com.dean.factory;

import com.dean.domain.TrainerLogin;
import com.dean.util.Misc;

public class TrainerLoginFactory {

    public static TrainerLogin getTrainerLogin(String emailAddress,String password){
        return new TrainerLogin.Builder().emailAddress(emailAddress).password(password).loginId(Misc.generateId())
                .build();
    }
}
