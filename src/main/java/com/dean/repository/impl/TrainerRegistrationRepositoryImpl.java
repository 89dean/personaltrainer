//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.TrainerRegistration;
//import com.dean.repository.TrainerRegistrationRepository;
//
//import java.util.*;
//
//public class TrainerRegistrationRepositoryImpl implements TrainerRegistrationRepository {
//
//    private static TrainerRegistrationRepositoryImpl repository = null;
//    private Map<String,TrainerRegistration> map = new HashMap<>();
//
//
//    public static TrainerRegistrationRepository  getRepository(){
//        if (repository==null) repository = new TrainerRegistrationRepositoryImpl();
//        return repository;
//    }
//    public Collection<TrainerRegistration>getAll(){
//        return map.values();
//    }
//
//    public TrainerRegistration create(String c, TrainerRegistration trainerRegistration){
//        map.put(c,trainerRegistration);
//        return trainerRegistration;
//
//    }
//    public TrainerRegistration read(String id){
//        return map.get(id);
//    }
//    public TrainerRegistration update(String c, TrainerRegistration trainerRegistration){
//        map.remove(c);
//        map.put(c,trainerRegistration);
//        return trainerRegistration;
//
//    }
//
//    public TrainerRegistration delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
