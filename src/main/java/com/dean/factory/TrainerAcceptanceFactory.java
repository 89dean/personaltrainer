package com.dean.factory;

import com.dean.domain.TrainerAcceptance;

public class TrainerAcceptanceFactory {

    public static TrainerAcceptance getTrainerAcceptance(String name,String surname,String message){
        return new TrainerAcceptance.Builder().name(name).surname(surname).message(message)
                .build();
    }
}
