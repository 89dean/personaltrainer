//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.TrainerAcceptance;
//import com.dean.repository.TrainerAcceptanceRepository;
//
//import java.util.*;
//
//public class TrainerAcceptanceRepositoryImpl implements TrainerAcceptanceRepository {
//
//    private static TrainerAcceptanceRepositoryImpl repository = null;
//    private Map<String,TrainerAcceptance> map = new HashMap<>();
//
//
//    public static TrainerAcceptanceRepository  getRepository(){
//        if (repository==null) repository = new TrainerAcceptanceRepositoryImpl();
//        return repository;
//    }
//    public Collection<TrainerAcceptance>getAll(){
//        return map.values();
//    }
//
//    public TrainerAcceptance create(String c, TrainerAcceptance trainerAcceptance){
//        map.put(c,trainerAcceptance);
//        return trainerAcceptance;
//
//    }
//    public TrainerAcceptance read(String id){
//        return map.get(id);
//    }
//    public TrainerAcceptance update(String c, TrainerAcceptance trainerAcceptance){
//        map.remove(c);
//        map.put(c,trainerAcceptance);
//        return trainerAcceptance;
//
//    }
//
//    public TrainerAcceptance delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
