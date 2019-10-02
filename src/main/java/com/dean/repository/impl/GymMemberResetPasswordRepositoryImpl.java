//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.GymMemberResetPassword;
//import com.dean.repository.GymMemberResetPasswordRepository;
//
//import java.util.*;
//
//public class GymMemberResetPasswordRepositoryImpl implements GymMemberResetPasswordRepository {
//
//    private static GymMemberResetPasswordRepositoryImpl repository = null;
//    private Map<String,GymMemberResetPassword> map = new HashMap<>();
//
//
//    public static GymMemberResetPasswordRepository  getRepository(){
//        if (repository==null) repository = new GymMemberResetPasswordRepositoryImpl();
//        return repository;
//    }
//    public Collection<GymMemberResetPassword>getAll(){
//        return map.values();
//    }
//
//    public GymMemberResetPassword create(String c, GymMemberResetPassword gymMemberResetPassword){
//        map.put(c,gymMemberResetPassword);
//        return gymMemberResetPassword;
//
//    }
//    public GymMemberResetPassword read(String id){
//        return map.get(id);
//    }
//    public GymMemberResetPassword update(String c, GymMemberResetPassword gymMemberResetPassword){
//        map.remove(c);
//        map.put(c,gymMemberResetPassword);
//        return gymMemberResetPassword;
//
//    }
//
//    public GymMemberResetPassword delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
