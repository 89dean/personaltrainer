package com.dean.factory;

import com.dean.domain.GymMemberUpdateDetails;

public class GymMemberUpdateDetailsFactory {

    public static GymMemberUpdateDetails getGymMemberUpdateDetails(String name,String surname){
        return new GymMemberUpdateDetails.Builder().name(name).surname(surname)
                .build();
    }
}
