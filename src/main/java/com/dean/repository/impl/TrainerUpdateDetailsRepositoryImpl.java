//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.TrainerUpdateDetails;
//import com.dean.repository.TrainerUpdateDetailsRepository;
//
//import java.util.*;
//
//public class TrainerUpdateDetailsRepositoryImpl implements TrainerUpdateDetailsRepository {
//
//    private static TrainerUpdateDetailsRepositoryImpl repository = null;
//    private Map<String,TrainerUpdateDetails> map = new HashMap<>();
//
//
//    public static TrainerUpdateDetailsRepository  getRepository(){
//        if (repository==null) repository = new TrainerUpdateDetailsRepositoryImpl();
//        return repository;
//    }
//    public Collection<TrainerUpdateDetails>getAll(){
//        return map.values();
//    }
//
//    public TrainerUpdateDetails create(String c, TrainerUpdateDetails trainerUpdateDetails){
//        map.put(c,trainerUpdateDetails);
//        return trainerUpdateDetails;
//
//    }
//    public TrainerUpdateDetails read(String id){
//        return map.get(id);
//    }
//    public TrainerUpdateDetails update(String c, TrainerUpdateDetails trainerUpdateDetails){
//        map.remove(c);
//        map.put(c,trainerUpdateDetails);
//        return trainerUpdateDetails;
//
//    }
//
//    public TrainerUpdateDetails delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//
//}
//
