package com.dean.factory;

import com.dean.domain.GymMemberResetPassword;
import com.dean.util.Misc;

public class GymMemberResetPasswordFactory {

    public static GymMemberResetPassword getGymMemberResetPassword(String emailAddress){
        return new GymMemberResetPassword.Builder().emailAddress(emailAddress).passwordId(Misc.generateId())
                .build();
    }
}
