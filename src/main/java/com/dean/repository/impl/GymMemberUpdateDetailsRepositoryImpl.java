//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.GymMemberUpdateDetails;
//import com.dean.repository.GymMemberUpdateDetailsRepository;
//
//import java.util.*;
//
//public class GymMemberUpdateDetailsRepositoryImpl implements GymMemberUpdateDetailsRepository {
//
//    private static GymMemberUpdateDetailsRepositoryImpl repository = null;
//    private Map<String,GymMemberUpdateDetails> map = new HashMap<>();
//
//
//    public static GymMemberUpdateDetailsRepository  getRepository(){
//        if (repository==null) repository = new GymMemberUpdateDetailsRepositoryImpl();
//        return repository;
//    }
//    public Collection<GymMemberUpdateDetails>getAll(){
//        return map.values();
//    }
//
//    public GymMemberUpdateDetails create(String c, GymMemberUpdateDetails gymMemberUpdateDetails){
//        map.put(c,gymMemberUpdateDetails);
//        return gymMemberUpdateDetails;
//
//    }
//    public GymMemberUpdateDetails read(String id){
//        return map.get(id);
//    }
//    public GymMemberUpdateDetails update(String c, GymMemberUpdateDetails gymMemberUpdateDetails){
//        map.remove(c);
//        map.put(c,gymMemberUpdateDetails);
//        return gymMemberUpdateDetails;
//
//    }
//
//    public GymMemberUpdateDetails delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
