//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CustomerResetPassword;
//import com.dean.repository.CustomerResetPasswordRepository;
//
//import java.util.*;
//
//public class CustomerResetPasswordRepositoryImpl implements CustomerResetPasswordRepository {
//
//    private static CustomerResetPasswordRepositoryImpl repository = null;
//    private Map<String,CustomerResetPassword> map = new HashMap<>();
//
//
//    public static CustomerResetPasswordRepository getRepository(){
//        if (repository==null) repository = new CustomerResetPasswordRepositoryImpl();
//        return repository;
//    }
//    public Collection<CustomerResetPassword>getAll(){
//        return map.values();
//    }
//
//    public CustomerResetPassword create(String c, CustomerResetPassword customerResetPassword){
//        map.put(c,customerResetPassword);
//        return customerResetPassword;
//
//    }
//    public CustomerResetPassword read(String id){
//        return map.get(id);
//    }
//    public CustomerResetPassword update(String c, CustomerResetPassword customerResetPassword){
//        map.remove(c);
//        map.put(c,customerResetPassword);
//        return customerResetPassword;
//
//    }
//
//    public CustomerResetPassword delete(String id){
//        if(map.containsKey(id)){
//            map.remove(id);
//        }
//        return map.remove(id);
//    }
//}
//
