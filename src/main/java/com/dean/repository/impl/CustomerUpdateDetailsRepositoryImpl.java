package com.dean.repository.impl;

import com.dean.domain.CustomerUpdateDetails;

import java.util.*;

public class CustomerUpdateDetailsRepositoryImpl implements CustomerUpdateDetailsRepository {

    private static CustomerUpdateDetailsRepositoryImpl repository = null;
    private Map<String,CustomerUpdateDetails> customerUpdateDetails;

    private CustomerUpdateDetailsRepositoryImpl(){

        this.customerUpdateDetails = new HashMap<>();
    }

    public static CustomerUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerUpdateDetailsRepositoryImpl();
        return repository;
    }

    public CustomerUpdateDetails create(CustomerUpdateDetails customerUpdateDetails){
        this.customerUpdateDetails.put(customerUpdateDetails.getName(),customerUpdateDetails);
        return customerUpdateDetails;
    }
    public CustomerUpdateDetails read(String name){
        return this.customerUpdateDetails.get(name);
    }
    public CustomerUpdateDetails update(CustomerUpdateDetails customerUpdateDetails){
        this.customerUpdateDetails.replace(customerUpdateDetails.getName(),customerUpdateDetails);
        return this.customerUpdateDetails.get(customerUpdateDetails.getName());
    }
    public void delete(String name){
        this.customerUpdateDetails.remove(name);
    }

    public Set<CustomerUpdateDetails>getAll(){
        Collection<CustomerUpdateDetails> customerUpdateDetails = this.customerUpdateDetails.values();
        Set<CustomerUpdateDetails> set = new HashSet<>();
        set.addAll(customerUpdateDetails);
        return set;
    }
}

