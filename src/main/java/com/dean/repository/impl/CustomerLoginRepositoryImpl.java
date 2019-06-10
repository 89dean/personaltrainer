package com.dean.repository.impl;

import com.dean.domain.CustomerLogin;

import java.util.*;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository{

    private static CustomerLoginRepositoryImpl repository = null;
    private Map<String,CustomerLogin> customerLogin;

    private CustomerLoginRepositoryImpl(){

        this.customerLogin = new HashMap<>();
    }

    public static CustomerLoginRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerLoginRepositoryImpl();
        return repository;
    }

    public CustomerLogin create(CustomerLogin customerLogin){
        this.customerLogin.put(customerLogin.getEmailAddress(),customerLogin);
        return customerLogin;
    }
    public CustomerLogin read(String emailAddress){
        return this.customerLogin.get(emailAddress);
    }
    public CustomerLogin update(CustomerLogin customerLogin){
        this.customerLogin.replace(customerLogin.getEmailAddress(),customerLogin);
        return this.customerLogin.get(customerLogin.getEmailAddress());
    }
    public void delete(String emailAddress){

        this.customerLogin.remove(emailAddress);
    }

    public Set<CustomerLogin>getAll(){
        Collection<CustomerLogin> customerLogin = this.customerLogin.values();
        Set<CustomerLogin> set = new HashSet<>();
        set.addAll(customerLogin);
        return set;
    }
}
