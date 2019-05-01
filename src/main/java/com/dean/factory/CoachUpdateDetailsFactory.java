package com.dean.factory;

import com.dean.domain.CoachUpdateDetails;

public class CoachUpdateDetailsFactory {

    public static CoachUpdateDetails getCoachUpdateDetails(String name,String surname){
        return new CoachUpdateDetails.Builder().name(name).surname(surname)
                .build();
    }
}
