package com.dean.repository.impl;

import com.dean.domain.CustomerResetPassword;
import com.dean.repository.CustomerResetPasswordRepository;

import java.util.*;

public class CustomerResetPasswordRepositoryImpl implements CustomerResetPasswordRepository {

    private static CustomerResetPasswordRepositoryImpl repository = null;
    private Set<CustomerResetPassword> customerResetPassword;

    private CustomerResetPasswordRepositoryImpl(){

        this.customerResetPassword = new HashSet<>();
    }
    private CustomerResetPassword findEmailAddress(String emailAddress) {
        return this.customerResetPassword.stream()
                .filter(customerResetPassword -> customerResetPassword.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }

    public static CustomerResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerResetPasswordRepositoryImpl();
        return repository;
    }

    public CustomerResetPassword create(CustomerResetPassword customerResetPassword){
        this.customerResetPassword.add(customerResetPassword);
        return customerResetPassword;
    }
    public CustomerResetPassword read(String emailAddress){
        CustomerResetPassword customerResetPassword = findEmailAddress(emailAddress);
        return customerResetPassword;
    }
    public CustomerResetPassword update(CustomerResetPassword customerResetPassword){
        CustomerResetPassword toDelete = findEmailAddress(customerResetPassword.getEmailAddress());
        if(toDelete != null) {
            this.customerResetPassword.remove(toDelete);
            return create(customerResetPassword);
        }
        return null;
    }
    public void delete(String emailAddress){
        CustomerResetPassword customerResetPassword = findEmailAddress(emailAddress);
        if (customerResetPassword != null) this.customerResetPassword.remove(emailAddress);
    }

    public Set<CustomerResetPassword>getAll(){
        return this.customerResetPassword;
    }
}

