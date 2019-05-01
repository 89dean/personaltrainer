package com.dean.factory;

import com.dean.domain.GymMemberResetPassword;

public class GymMemberResetPasswordFactory {

    public static GymMemberResetPassword getGymMemberResetPassword(String emailAddress){
        return new GymMemberResetPassword.Builder().emailAddress(emailAddress)
                .build();
    }
}
