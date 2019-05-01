package com.dean.factory;

import com.dean.domain.TrainerResetPassword;

public class TrainerResetPasswordFactory {

    public static TrainerResetPassword getTrainerResetPassword(String emailAddress){
        return new TrainerResetPassword.Builder().emailAddress(emailAddress)
                .build();
    }
}
