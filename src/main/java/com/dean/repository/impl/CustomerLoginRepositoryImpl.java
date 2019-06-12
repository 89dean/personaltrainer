package com.dean.repository.impl;

import com.dean.domain.CustomerLogin;
import com.dean.repository.CustomerLoginRepository;

import java.util.*;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {

    private static CustomerLoginRepositoryImpl repository = null;
    private Set<CustomerLogin> customerLogin;

    private CustomerLoginRepositoryImpl(){

        this.customerLogin = new HashSet<>();
    }
    private CustomerLogin findEmailAddress(String emailAddress) {
        return this.customerLogin.stream()
                .filter(customerLogin -> customerLogin.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }


        public static CustomerLoginRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerLoginRepositoryImpl();
        return repository;
    }

    public CustomerLogin create(CustomerLogin customerLogin){
        this.customerLogin.add(customerLogin);
        return customerLogin;
    }
    public CustomerLogin read(String emailAddress){
        CustomerLogin customerLogin = findEmailAddress(emailAddress);
        return customerLogin;
    }
    public CustomerLogin update(CustomerLogin customerLogin){
        CustomerLogin toDelete = findEmailAddress(customerLogin.getEmailAddress());
        if(toDelete != null) {
            this.customerLogin.remove(toDelete);
            return create(customerLogin);
        }
        return null;
    }
    public void delete(String emailAddress){
        CustomerLogin customerLogin = findEmailAddress(emailAddress);
        if (customerLogin != null) this.customerLogin.remove(emailAddress);
    }

    public Set<CustomerLogin>getAll(){
        return this.customerLogin;
    }
}
