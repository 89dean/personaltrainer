//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CustomerUpdateDetails;
//import com.dean.repository.CustomerUpdateDetailsRepository;
//
//import java.util.*;
//
//public class CustomerUpdateDetailsRepositoryImpl implements CustomerUpdateDetailsRepository {
//
//    private static CustomerUpdateDetailsRepositoryImpl repository = null;
//    private Map<String,CustomerUpdateDetails> map = new HashMap<>();
//
//
//    public static CustomerUpdateDetailsRepository  getRepository(){
//        if (repository==null) repository = new CustomerUpdateDetailsRepositoryImpl();
//        return repository;
//    }
//    public Collection<CustomerUpdateDetails>getAll(){
//        return map.values();
//    }
//
//    public CustomerUpdateDetails create(String c, CustomerUpdateDetails customerUpdateDetails){
//        map.put(c,customerUpdateDetails);
//        return customerUpdateDetails;
//
//    }
//    public CustomerUpdateDetails read(String id){
//        return map.get(id);
//    }
//    public CustomerUpdateDetails update(String c, CustomerUpdateDetails customerUpdateDetails){
//        map.remove(c);
//        map.put(c,customerUpdateDetails);
//        return customerUpdateDetails;
//
//    }
//
//    public CustomerUpdateDetails delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
//
