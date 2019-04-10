package com.dean.factory;

import com.dean.domain.RegistrationForm;

public class RegistrationFormFactory {

    public static RegistrationForm getRegistrationForm(String name,String surname,String emailAddress,String preferedSport){
        return new RegistrationForm.Builder().name(name)
                .surname(surname)
                .emailAddress(emailAddress)
                .prferedSport(preferedSport)
                .build();

    }
}
