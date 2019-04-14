package com.dean.factory;

import com.dean.domain.TrainerAcceptance;

public class TrainerAcceptanceFactory {

    public static TrainerAcceptance getTrainerAcceptance(String message){
        return new TrainerAcceptance.Builder().message(message)
                .build();
    }
}
