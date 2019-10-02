//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CustomerLogin;
//import com.dean.repository.CustomerLoginRepository;
//
//import java.util.*;
//
//public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {
//
//    private static CustomerLoginRepositoryImpl repository = null;
//    private Map<String,CustomerLogin> map = new HashMap<>();
//
//
//    public static CustomerLoginRepository  getRepository(){
//        if (repository==null) repository = new CustomerLoginRepositoryImpl();
//        return repository;
//    }
//    public Collection<CustomerLogin>getAll(){
//        return map.values();
//    }
//
//    public CustomerLogin create(String c, CustomerLogin customerLogin){
//        map.put(c,customerLogin);
//        return customerLogin;
//
//    }
//    public CustomerLogin read(String id){
//        return map.get(id);
//    }
//    public CustomerLogin update(String c, CustomerLogin customerLogin){
//        map.remove(c);
//        map.put(c,customerLogin);
//        return customerLogin;
//
//    }
//
//    public CustomerLogin delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
