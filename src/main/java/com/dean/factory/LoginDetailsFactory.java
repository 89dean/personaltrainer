package com.dean.factory;

import com.dean.domain.LoginDetails;

public class LoginDetailsFactory {

    public static LoginDetails getLoginDetails(String emailAddress,String password){
        return new LoginDetails.Builder().emailAddress(emailAddress)
                .password(password)
                .build();

    }
}
