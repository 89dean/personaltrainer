//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.TrainerLogin;
//import com.dean.repository.TrainerLoginRepository;
//
//import java.util.*;
//
//public class TrainerLoginRepositoryImpl implements TrainerLoginRepository {
//
//    private static TrainerLoginRepositoryImpl repository = null;
//    private Map<String,TrainerLogin> map = new HashMap<>();
//
//
//    public static TrainerLoginRepository  getRepository(){
//        if (repository==null) repository = new TrainerLoginRepositoryImpl();
//        return repository;
//    }
//    public Collection<TrainerLogin>getAll(){
//        return map.values();
//    }
//
//    public TrainerLogin create(String c, TrainerLogin trainerLogin){
//        map.put(c,trainerLogin);
//        return trainerLogin;
//
//    }
//    public TrainerLogin read(String id){
//        return map.get(id);
//    }
//    public TrainerLogin update(String c, TrainerLogin trainerLogin){
//        map.remove(c);
//        map.put(c,trainerLogin);
//        return trainerLogin;
//
//    }
//
//    public TrainerLogin delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
