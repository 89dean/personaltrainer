//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.TrainerResetPassword;
//import com.dean.repository.TrainerResetPasswordRepository;
//
//import java.util.*;
//
//public class TrainerResetPasswordRepositoryImpl implements TrainerResetPasswordRepository {
//
//    private static TrainerResetPasswordRepositoryImpl repository = null;
//    private Map<String,TrainerResetPassword> map = new HashMap<>();
//
//
//    public static TrainerResetPasswordRepository  getRepository(){
//        if (repository==null) repository = new TrainerResetPasswordRepositoryImpl();
//        return repository;
//    }
//    public Collection<TrainerResetPassword>getAll(){
//        return map.values();
//    }
//
//    public TrainerResetPassword create(String c, TrainerResetPassword trainerResetPassword){
//        map.put(c,trainerResetPassword);
//        return trainerResetPassword;
//
//    }
//    public TrainerResetPassword read(String id){
//        return map.get(id);
//    }
//    public TrainerResetPassword update(String c, TrainerResetPassword trainerResetPassword){
//        map.remove(c);
//        map.put(c,trainerResetPassword);
//        return trainerResetPassword;
//
//    }
//
//    public TrainerResetPassword delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
//
