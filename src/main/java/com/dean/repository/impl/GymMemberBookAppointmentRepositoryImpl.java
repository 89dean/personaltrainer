//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.GymMemberBookAppointment;
//import com.dean.repository.GymMemberBookAppointmentRepository;
//
//import java.util.*;
//
//public class GymMemberBookAppointmentRepositoryImpl implements GymMemberBookAppointmentRepository {
//
//    private static GymMemberBookAppointmentRepositoryImpl repository = null;
//    private Map<String,GymMemberBookAppointment> map = new HashMap<>();
//
//
//    public static GymMemberBookAppointmentRepository  getRepository(){
//        if (repository==null) repository = new GymMemberBookAppointmentRepositoryImpl();
//        return repository;
//    }
//    public Collection<GymMemberBookAppointment>getAll(){
//        return map.values();
//    }
//
//    public GymMemberBookAppointment create(String c, GymMemberBookAppointment gymMemberBookAppointment){
//        map.put(c,gymMemberBookAppointment);
//        return gymMemberBookAppointment;
//
//    }
//    public GymMemberBookAppointment read(String id){
//        return map.get(id);
//    }
//    public GymMemberBookAppointment update(String c, GymMemberBookAppointment gymMemberBookAppointment){
//        map.remove(c);
//        map.put(c,gymMemberBookAppointment);
//        return gymMemberBookAppointment;
//
//    }
//
//    public GymMemberBookAppointment delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
