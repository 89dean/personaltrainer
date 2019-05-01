package com.dean.factory;

import com.dean.domain.TrainerLogin;

public class TrainerLoginFactory {

    public static TrainerLogin getTrainerLogin(String emailAddress,String password){
        return new TrainerLogin.Builder().emailAddress(emailAddress).password(password)
                .build();
    }
}
