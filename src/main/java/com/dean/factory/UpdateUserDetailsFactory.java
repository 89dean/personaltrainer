package com.dean.factory;

import com.dean.domain.UpdateUserDetails;

public class UpdateUserDetailsFactory {

    public static UpdateUserDetails getUpdateUserDetails(String name,String surname){
        return new UpdateUserDetails.Builder().name(name)
                .surname(surname)
                .build();
    }
}
