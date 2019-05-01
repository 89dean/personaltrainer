package com.dean.repository.impl;

import com.dean.domain.CustomerResetPassword;

import java.util.HashSet;
import java.util.Set;

public class CustomerResetPasswordRepositoryImpl implements CustomerResetPasswordRepository{

    private static CustomerResetPasswordRepositoryImpl repository = null;
    private Set<CustomerResetPassword> customerResetPassword;

    private CustomerResetPasswordRepositoryImpl(){

        this.customerResetPassword = new HashSet<>();
    }

    public static CustomerResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerResetPasswordRepositoryImpl();
        return repository;
    }

    public CustomerResetPassword create(CustomerResetPassword customerResetPassword){
        this.customerResetPassword.add(customerResetPassword);
        return customerResetPassword;
    }
    public void delete(CustomerResetPassword customerResetPassword){
        this.customerResetPassword.remove(customerResetPassword);
    }
    public CustomerResetPassword read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private CustomerResetPassword findMessage(String customerResetPassword) {
        for(CustomerResetPassword c: this.customerResetPassword){
            if(c.getEmailAddress().equals(customerResetPassword)) return c;
        }
        return null;
    }

    public CustomerResetPassword update(CustomerResetPassword customerResetPassword){
        CustomerResetPassword c = findMessage(customerResetPassword.getEmailAddress());
        if(c != null){
            CustomerResetPassword a = new CustomerResetPassword.Builder().Copy(customerResetPassword).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<CustomerResetPassword>getAll(){

        return this.customerResetPassword;
    }
}

