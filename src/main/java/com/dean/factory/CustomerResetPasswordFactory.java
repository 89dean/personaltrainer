package com.dean.factory;

import com.dean.domain.CustomerResetPassword;
import com.dean.util.Misc;

public class CustomerResetPasswordFactory {

    public static CustomerResetPassword getCustomerResetPassword(String emailAddress){
        return new CustomerResetPassword.Builder().emailAddress(emailAddress).resetId(Misc.generateId())
                .build();
    }
}
