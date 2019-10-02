//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CoachUpdateDetails;
//import com.dean.repository.CoachUpdateDetailsRepository;
//
//import java.util.*;
//
//public class CoachUpdateDetailsRepositoryImpl implements CoachUpdateDetailsRepository {
//
//    private static CoachUpdateDetailsRepositoryImpl repository = null;
//    private Map<String,CoachUpdateDetails> map = new HashMap<>();
//
//
//    public static CoachUpdateDetailsRepository  getRepository(){
//        if (repository==null) repository = new CoachUpdateDetailsRepositoryImpl();
//        return repository;
//    }
//    public Collection<CoachUpdateDetails>getAll(){
//        return map.values();
//    }
//
//    public CoachUpdateDetails create(String c, CoachUpdateDetails coachUpdateDetails){
//        map.put(c,coachUpdateDetails);
//        return coachUpdateDetails;
//
//    }
//    public CoachUpdateDetails read(String id){
//        return map.get(id);
//    }
//    public CoachUpdateDetails update(String c, CoachUpdateDetails coachUpdateDetails){
//        map.remove(c);
//        map.put(c,coachUpdateDetails);
//        return coachUpdateDetails;
//
//    }
//
//    public CoachUpdateDetails delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
