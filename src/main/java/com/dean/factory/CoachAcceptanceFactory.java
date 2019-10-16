//package com.dean.factory;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.util.Misc;
//
//public class CoachAcceptanceFactory {
//
//    public static CoachAcceptance getCoachAcceptance(String name,String surname,String message){
//        return new CoachAcceptance.Builder()
//                .name(name)
//                .surname(surname)
//                .message(message)
//                .id(Misc.generateId())
//                .build();
//    }
//}
