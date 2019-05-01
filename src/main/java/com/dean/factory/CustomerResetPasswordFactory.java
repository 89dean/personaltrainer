package com.dean.factory;

import com.dean.domain.CustomerResetPassword;

public class CustomerResetPasswordFactory {

    public static CustomerResetPassword getCustomerResetPassword(String emailAddress){
        return new CustomerResetPassword.Builder().emailAddress(emailAddress)
                .build();
    }
}
