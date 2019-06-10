package com.dean.repository.impl;

import com.dean.domain.CustomerResetPassword;

import java.util.*;

public class CustomerResetPasswordRepositoryImpl implements CustomerResetPasswordRepository{

    private static CustomerResetPasswordRepositoryImpl repository = null;
    private Map<String,CustomerResetPassword> customerResetPassword;

    private CustomerResetPasswordRepositoryImpl(){

        this.customerResetPassword = new HashMap<>();
    }

    public static CustomerResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerResetPasswordRepositoryImpl();
        return repository;
    }

    public CustomerResetPassword create(CustomerResetPassword customerResetPassword){
        this.customerResetPassword.put(customerResetPassword.getEmailAddress(),customerResetPassword);
        return customerResetPassword;
    }
    public CustomerResetPassword read(String emailAddress){
        return this.customerResetPassword.get(emailAddress);
    }
    public CustomerResetPassword update(CustomerResetPassword customerResetPassword){
        this.customerResetPassword.replace(customerResetPassword.getEmailAddress(),customerResetPassword);
        return this.customerResetPassword.get(customerResetPassword.getEmailAddress());
    }
    public void delete(String emailAddress){
        this.customerResetPassword.remove(emailAddress);
    }

    public Set<CustomerResetPassword>getAll(){
        Collection<CustomerResetPassword> customerResetPassword = this.customerResetPassword.values();
        Set<CustomerResetPassword> set = new HashSet<>();
        set.addAll(customerResetPassword);
        return set;
    }
}

