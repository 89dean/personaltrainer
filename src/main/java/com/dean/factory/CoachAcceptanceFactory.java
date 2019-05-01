package com.dean.factory;

import com.dean.domain.CoachAcceptance;

public class CoachAcceptanceFactory {

    public static CoachAcceptance getCoachAcceptance(String name,String surname,String message){
        return new CoachAcceptance.Builder().name(name).surname(surname).message(message)
                .build();
    }
}
