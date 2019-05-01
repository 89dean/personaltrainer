package com.dean.factory;

import com.dean.domain.CustomerLogin;

public class CustomerLoginFactory {

    public static CustomerLogin getCustomerLogin(String emailAdress,String password){
        return new CustomerLogin.Builder().emailAddress(emailAdress).password(password)
                .build();
    }
}
