package com.dean.factory;

import com.dean.domain.CoachResetPassword;

public class CoachResetPasswordFactory {

    public static CoachResetPassword getCoachResetPassword(String emailAddress){
        return new CoachResetPassword.Builder().emailAddress(emailAddress)
                .build();
    }
}
