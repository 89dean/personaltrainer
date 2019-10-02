//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.GymMemberLogin;
//import com.dean.repository.GymMemberLoginRepository;
//
//import java.util.*;
//
//public class GymMemberLoginRepositoryImpl implements GymMemberLoginRepository {
//
//    private static GymMemberLoginRepositoryImpl repository = null;
//    private Map<String,GymMemberLogin> map = new HashMap<>();
//
//
//    public static GymMemberLoginRepository  getRepository(){
//        if (repository==null) repository = new GymMemberLoginRepositoryImpl();
//        return repository;
//    }
//    public Collection<GymMemberLogin>getAll(){
//        return map.values();
//    }
//
//    public GymMemberLogin create(String c, GymMemberLogin gymMemberLogin){
//        map.put(c,gymMemberLogin);
//        return gymMemberLogin;
//
//    }
//    public GymMemberLogin read(String id){
//        return map.get(id);
//    }
//    public GymMemberLogin update(String c, GymMemberLogin gymMemberLogin){
//        map.remove(c);
//        map.put(c,gymMemberLogin);
//        return gymMemberLogin;
//
//    }
//
//    public GymMemberLogin delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
