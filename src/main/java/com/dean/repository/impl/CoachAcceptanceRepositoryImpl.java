//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.repository.CoachAcceptanceRepository;
//
//import java.util.*;
//
//public class CoachAcceptanceRepositoryImpl implements CoachAcceptanceRepository {
//
//    private static CoachAcceptanceRepositoryImpl repository = null;
//    private Map<String,CoachAcceptance> map = new HashMap<>();
//
//
//    public static CoachAcceptanceRepository  getRepository(){
//        if (repository==null) repository = new CoachAcceptanceRepositoryImpl();
//        return repository;
//    }
//    public Collection<CoachAcceptance>getAll(){
//        return map.values();
//    }
//
//    public CoachAcceptance create(String c, CoachAcceptance coachAcceptance){
//        map.put(c,coachAcceptance);
//        return coachAcceptance;
//
//    }
//    public CoachAcceptance read(String id){
//        return map.get(id);
//    }
//    public CoachAcceptance update(String c, CoachAcceptance coachAcceptance){
//        map.remove(c);
//        map.put(c,coachAcceptance);
//        return coachAcceptance;
//
//    }
//
//    public CoachAcceptance delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//
//}
