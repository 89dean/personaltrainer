//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.GymMemberCancelation;
//import com.dean.repository.GymMemberCancelationRepository;
//
//import java.util.*;
//
//public class GymMemberCancelationRepositoryImpl implements GymMemberCancelationRepository {
//
//    private static GymMemberCancelationRepositoryImpl repository = null;
//    private Map<String,GymMemberCancelation> map = new HashMap<>();
//
//
//    public static GymMemberCancelationRepository  getRepository(){
//        if (repository==null) repository = new GymMemberCancelationRepositoryImpl();
//        return repository;
//    }
//    public Collection<GymMemberCancelation>getAll(){
//        return map.values();
//    }
//
//    public GymMemberCancelation create(String c, GymMemberCancelation gymMemberCancelation){
//        map.put(c,gymMemberCancelation);
//        return gymMemberCancelation;
//
//    }
//    public GymMemberCancelation read(String id){
//        return map.get(id);
//    }
//    public GymMemberCancelation update(String c, GymMemberCancelation gymMemberCancelation){
//        map.remove(c);
//        map.put(c,gymMemberCancelation);
//        return gymMemberCancelation;
//
//    }
//
//    public GymMemberCancelation delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
