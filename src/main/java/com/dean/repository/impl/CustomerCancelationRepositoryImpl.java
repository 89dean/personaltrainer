//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CustomerCancelation;
//import com.dean.repository.CustomerCancelationRepository;
//
//import java.util.*;
//
//public class CustomerCancelationRepositoryImpl implements CustomerCancelationRepository {
//
//    private static CustomerCancelationRepositoryImpl repository = null;
//    private Map<String,CustomerCancelation> map = new HashMap<>();
//
//
//    public static CustomerCancelationRepository  getRepository(){
//        if (repository==null) repository = new CustomerCancelationRepositoryImpl();
//        return repository;
//    }
//    public Collection<CustomerCancelation>getAll(){
//        return map.values();
//    }
//
//    public CustomerCancelation create(String c, CustomerCancelation customerCancelation){
//        map.put(c,customerCancelation);
//        return customerCancelation;
//
//    }
//    public CustomerCancelation read(String id){
//        return map.get(id);
//    }
//    public CustomerCancelation update(String c, CustomerCancelation customerCancelation){
//        map.remove(c);
//        map.put(c,customerCancelation);
//        return customerCancelation;
//
//    }
//
//    public CustomerCancelation delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
