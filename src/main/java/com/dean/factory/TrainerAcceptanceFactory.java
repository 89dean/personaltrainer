package com.dean.factory;

import com.dean.domain.TrainerAcceptance;
import com.dean.util.Misc;

public class TrainerAcceptanceFactory {

    public static TrainerAcceptance getTrainerAcceptance(String name,String surname,String message){
        return new TrainerAcceptance.Builder().name(name).surname(surname).message(message).acceptanceId(Misc.generateId())
                .build();
    }
}
