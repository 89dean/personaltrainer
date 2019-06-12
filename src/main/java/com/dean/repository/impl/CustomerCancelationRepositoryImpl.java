package com.dean.repository.impl;

import com.dean.domain.CustomerCancelation;
import com.dean.repository.CustomerCancelationRepository;

import java.util.*;

public class CustomerCancelationRepositoryImpl implements CustomerCancelationRepository {

    private static CustomerCancelationRepositoryImpl repository = null;
    private Set<CustomerCancelation> customerCancelation;

    private CustomerCancelationRepositoryImpl(){

        this.customerCancelation = new HashSet<>();
    }
    private CustomerCancelation findCancelMessage(String message) {
        return this.customerCancelation.stream()
                .filter(customerCancelation -> customerCancelation.getCancelMessage().trim().equals(message))
                .findAny()
                .orElse(null);
    }

    public static CustomerCancelationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerCancelationRepositoryImpl();
        return repository;
    }

    public CustomerCancelation create(CustomerCancelation customerCancelation){
        this.customerCancelation.add(customerCancelation);
        return customerCancelation;
    }
    public CustomerCancelation read(String name){
        CustomerCancelation customerCancelation = findCancelMessage(name);
        return customerCancelation;
    }
    public CustomerCancelation update(CustomerCancelation customerCancelation){
        CustomerCancelation toDelete = findCancelMessage(customerCancelation.getCancelMessage());
        if(toDelete != null) {
            this.customerCancelation.remove(toDelete);
            return create(customerCancelation);
        }
        return null;
    }
    public void delete(String message){
        CustomerCancelation customerCancelation = findCancelMessage(message);
        if (customerCancelation != null) this.customerCancelation.remove(message);
    }

    public Set<CustomerCancelation>getAll(){
        return this.customerCancelation;
    }
}
