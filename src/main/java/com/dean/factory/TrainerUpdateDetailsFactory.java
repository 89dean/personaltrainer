package com.dean.factory;

import com.dean.domain.TrainerUpdateDetails;

public class TrainerUpdateDetailsFactory {

    public static TrainerUpdateDetails getTrainerUpdateDetails(String name,String surname){
        return new TrainerUpdateDetails.Builder().name(name).surname(surname)
                .build();
    }
}
