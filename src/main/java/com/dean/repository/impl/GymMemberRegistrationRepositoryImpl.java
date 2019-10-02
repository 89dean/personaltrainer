//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.GymMemberRegistration;
//import com.dean.repository.GymMemberRegistrationRepository;
//
//import java.util.*;
//
//public class GymMemberRegistrationRepositoryImpl implements GymMemberRegistrationRepository {
//
//    private static GymMemberRegistrationRepositoryImpl repository = null;
//    private Map<String,GymMemberRegistration> map = new HashMap<>();
//
//
//    public static GymMemberRegistrationRepository  getRepository(){
//        if (repository==null) repository = new GymMemberRegistrationRepositoryImpl();
//        return repository;
//    }
//    public Collection<GymMemberRegistration>getAll(){
//        return map.values();
//    }
//
//    public GymMemberRegistration create(String c, GymMemberRegistration gymMemberRegistration){
//        map.put(c,gymMemberRegistration);
//        return gymMemberRegistration;
//
//    }
//    public GymMemberRegistration read(String id){
//        return map.get(id);
//    }
//    public GymMemberRegistration update(String c, GymMemberRegistration gymMemberRegistration){
//        map.remove(c);
//        map.put(c,gymMemberRegistration);
//        return gymMemberRegistration;
//
//    }
//
//    public GymMemberRegistration delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
