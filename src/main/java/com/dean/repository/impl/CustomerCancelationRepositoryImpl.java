package com.dean.repository.impl;

import com.dean.domain.CustomerCancelation;

import java.util.HashSet;
import java.util.Set;

public class CustomerCancelationRepositoryImpl implements CustomerCancelationRepository {

    private static CustomerCancelationRepositoryImpl repository = null;
    private Set<CustomerCancelation> customerCancelation;

    private CustomerCancelationRepositoryImpl(){
        this.customerCancelation = new HashSet<>();
    }

    public static CustomerCancelationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerCancelationRepositoryImpl();
        return repository;
    }

    public CustomerCancelation create(CustomerCancelation customerCancelation){
        this.customerCancelation.add(customerCancelation);
        return customerCancelation;
    }
    public void delete(CustomerCancelation customerCancelation){
        this.customerCancelation.remove(customerCancelation);
    }
    public CustomerCancelation read(final String message){
        return findMessage(message);

    }

    private CustomerCancelation findMessage(String customerCancelation) {
        for(CustomerCancelation c: this.customerCancelation){
            if(c.getCancelMessage().equals(customerCancelation)) return c;
        }
        return null;
    }

    public CustomerCancelation update(CustomerCancelation customerCancelation){
        CustomerCancelation c = findMessage(customerCancelation.getCancelMessage());
        if(c != null){
            CustomerCancelation a = new CustomerCancelation.Builder().Copy(customerCancelation).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<CustomerCancelation>getAll(){
        return this.customerCancelation;
    }
}
