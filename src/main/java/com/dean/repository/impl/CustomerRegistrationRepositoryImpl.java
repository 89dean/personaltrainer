//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CustomerRegistration;
//import com.dean.repository.CustomerRegistrationRepository;
//
//import java.util.*;
//
//public class CustomerRegistrationRepositoryImpl implements CustomerRegistrationRepository {
//
//    private static CustomerRegistrationRepositoryImpl repository = null;
//    private Map<String,CustomerRegistration> map = new HashMap<>();
//
//
//    public static CustomerRegistrationRepository  getRepository(){
//        if (repository==null) repository = new CustomerRegistrationRepositoryImpl();
//        return repository;
//    }
//    public Collection<CustomerRegistration>getAll(){
//        return map.values();
//    }
//
//    public CustomerRegistration create(String c, CustomerRegistration customerRegistration){
//        map.put(c,customerRegistration);
//        return customerRegistration;
//
//    }
//    public CustomerRegistration read(String id){
//        return map.get(id);
//    }
//    public CustomerRegistration update(String c, CustomerRegistration customerRegistration){
//        map.remove(c);
//        map.put(c,customerRegistration);
//        return customerRegistration;
//
//    }
//
//    public CustomerRegistration delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//
//}
