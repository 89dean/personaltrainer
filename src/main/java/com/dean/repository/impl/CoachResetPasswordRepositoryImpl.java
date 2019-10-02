//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CoachResetPassword;
//import com.dean.repository.CoachResetPasswordRepository;
//
//import java.util.*;
//
//public class CoachResetPasswordRepositoryImpl implements CoachResetPasswordRepository {
//
//    private static CoachResetPasswordRepositoryImpl repository = null;
//    private Map<String,CoachResetPassword> map = new HashMap<>();
//
//
//    public static CoachResetPasswordRepository  getRepository(){
//        if (repository==null) repository = new CoachResetPasswordRepositoryImpl();
//        return repository;
//    }
//    public Collection<CoachResetPassword>getAll(){
//        return map.values();
//    }
//
//    public CoachResetPassword create(String c, CoachResetPassword coachResetPassword){
//        map.put(c,coachResetPassword);
//        return coachResetPassword;
//
//    }
//    public CoachResetPassword read(String id){
//        return map.get(id);
//    }
//    public CoachResetPassword update(String c, CoachResetPassword coachResetPassword){
//        map.remove(c);
//        map.put(c,coachResetPassword);
//        return coachResetPassword;
//
//    }
//
//    public CoachResetPassword delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
