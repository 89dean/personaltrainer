//package com.dean.factory;
//
//import com.dean.domain.GymMemberLogin;
//import com.dean.util.Misc;
//
//public class GymMemberLoginFactory {
//
//    public static GymMemberLogin getGymMemberLogin(String emailAdress,String password){
//        return new GymMemberLogin.Builder().emailAddress(emailAdress).password(password).loginId(Misc.generateId())
//                .build();
//    }
//}
