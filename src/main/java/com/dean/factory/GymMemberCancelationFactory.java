package com.dean.factory;

import com.dean.domain.GymMemberCancelation;

public class GymMemberCancelationFactory {

    public static GymMemberCancelation getGymMemberCancelation(String name,String surnmae,String cancelMessage){
        return new GymMemberCancelation.Builder().name(name).surname(surnmae).cancelMessage(cancelMessage)
                .build();
    }
}
