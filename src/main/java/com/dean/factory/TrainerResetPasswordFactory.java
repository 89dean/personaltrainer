package com.dean.factory;

import com.dean.domain.TrainerResetPassword;
import com.dean.util.Misc;

public class TrainerResetPasswordFactory {

    public static TrainerResetPassword getTrainerResetPassword(String emailAddress){
        return new TrainerResetPassword.Builder().emailAddress(emailAddress).passwordId(Misc.generateId())
                .build();
    }
}
