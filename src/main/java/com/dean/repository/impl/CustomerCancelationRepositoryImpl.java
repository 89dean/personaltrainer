package com.dean.repository.impl;

import com.dean.domain.CustomerCancelation;

import java.util.*;

public class CustomerCancelationRepositoryImpl implements CustomerCancelationRepository {

    private static CustomerCancelationRepositoryImpl repository = null;
    private Map<String,CustomerCancelation> customerCancelation;

    private CustomerCancelationRepositoryImpl(){

        this.customerCancelation = new HashMap<>();
    }

    public static CustomerCancelationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerCancelationRepositoryImpl();
        return repository;
    }

    public CustomerCancelation create(CustomerCancelation customerCancelation){
        this.customerCancelation.put(customerCancelation.getCancelMessage(),customerCancelation);
        return customerCancelation;
    }
    public CustomerCancelation read(String name){
        return this.customerCancelation.get(name);
    }
    public CustomerCancelation update(CustomerCancelation customerCancelation){
        this.customerCancelation.replace(customerCancelation.getCancelMessage(),customerCancelation);
        return this.customerCancelation.get(customerCancelation.getCancelMessage());
    }
    public void delete(String message){
        this.customerCancelation.remove(message);
    }

    public Set<CustomerCancelation>getAll(){
        Collection<CustomerCancelation> customerCancelations = this.customerCancelation.values();
        Set<CustomerCancelation> set = new HashSet<>();
        set.addAll(customerCancelations);
        return set;
    }
}
