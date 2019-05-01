package com.dean.repository.impl;

import com.dean.domain.CustomerLogin;

import java.util.HashSet;
import java.util.Set;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository{

    private static CustomerLoginRepositoryImpl repository = null;
    private Set<CustomerLogin> customerLogin;

    private CustomerLoginRepositoryImpl(){
        this.customerLogin = new HashSet<>();
    }

    public static CustomerLoginRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerLoginRepositoryImpl();
        return repository;
    }

    public CustomerLogin create(CustomerLogin customerLogin){
        this.customerLogin.add(customerLogin);
        return customerLogin;
    }
    public void delete(CustomerLogin customerLogin){
        this.customerLogin.remove(customerLogin);
    }
    public CustomerLogin read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private CustomerLogin findMessage(String customerLogin) {
        for(CustomerLogin c: this.customerLogin){
            if(c.getEmailAddress().equals(customerLogin)) return c;
        }
        return null;
    }

    public CustomerLogin update(CustomerLogin customerLogin){
        CustomerLogin c = findMessage(customerLogin.getEmailAddress());
        if(c != null){
            CustomerLogin a = new CustomerLogin.Builder().Copy(customerLogin).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String emailAddress) {

    }

    public Set<CustomerLogin>getAll(){

        return this.customerLogin;
    }
}
