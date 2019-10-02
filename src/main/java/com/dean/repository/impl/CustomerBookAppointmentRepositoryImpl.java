//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CustomerBookAppointment;
//import com.dean.repository.CustomerBookAppointmentRepository;
//
//import java.util.*;
//
//public class CustomerBookAppointmentRepositoryImpl implements CustomerBookAppointmentRepository {
//
//    private static CustomerBookAppointmentRepositoryImpl repository = null;
//    private Map<String,CustomerBookAppointment> map = new HashMap<>();
//
//
//    public static CustomerBookAppointmentRepository  getRepository(){
//        if (repository==null) repository = new CustomerBookAppointmentRepositoryImpl();
//        return repository;
//    }
//    public Collection<CustomerBookAppointment>getAll(){
//        return map.values();
//    }
//
//    public CustomerBookAppointment create(String c, CustomerBookAppointment customerBookAppointment){
//        map.put(c,customerBookAppointment);
//        return customerBookAppointment;
//
//    }
//    public CustomerBookAppointment read(String id){
//        return map.get(id);
//    }
//    public CustomerBookAppointment update(String c, CustomerBookAppointment customerBookAppointment){
//        map.remove(c);
//        map.put(c,customerBookAppointment);
//        return customerBookAppointment;
//
//    }
//
//    public CustomerBookAppointment delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
