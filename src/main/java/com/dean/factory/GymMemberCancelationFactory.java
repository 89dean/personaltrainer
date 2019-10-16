//package com.dean.factory;
//
//import com.dean.domain.GymMemberCancelation;
//import com.dean.util.Misc;
//
//public class GymMemberCancelationFactory {
//
//    public static GymMemberCancelation getGymMemberCancelation(String name,String surnmae,String cancelMessage){
//        return new GymMemberCancelation.Builder().name(name).surname(surnmae).cancelMessage(cancelMessage).cancelationId(Misc.generateId())
//                .build();
//    }
//}
