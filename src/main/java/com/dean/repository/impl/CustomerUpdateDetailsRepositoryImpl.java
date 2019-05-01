package com.dean.repository.impl;

import com.dean.domain.CustomerUpdateDetails;

import java.util.HashSet;
import java.util.Set;

public class CustomerUpdateDetailsRepositoryImpl implements CustomerUpdateDetailsRepository {

    private static CustomerUpdateDetailsRepositoryImpl repository = null;
    private Set<CustomerUpdateDetails> customerUpdateDetails;

    private CustomerUpdateDetailsRepositoryImpl(){
        this.customerUpdateDetails = new HashSet<>();
    }

    public static CustomerUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerUpdateDetailsRepositoryImpl();
        return repository;
    }

    public CustomerUpdateDetails create(CustomerUpdateDetails customerUpdateDetails){
        this.customerUpdateDetails.add(customerUpdateDetails);
        return customerUpdateDetails;
    }
    public void delete(CustomerUpdateDetails customerUpdateDetails){
        this.customerUpdateDetails.remove(customerUpdateDetails);
    }
    public CustomerUpdateDetails read(final String name){
        return findMessage(name);

    }

    private CustomerUpdateDetails findMessage(String customerUpdateDetails) {
        for(CustomerUpdateDetails c: this.customerUpdateDetails){
            if(c.getName().equals(customerUpdateDetails)) return c;
        }
        return null;
    }

    public CustomerUpdateDetails update(CustomerUpdateDetails customerUpdateDetails){
        CustomerUpdateDetails c = findMessage(customerUpdateDetails.getName());
        if(c != null){
            CustomerUpdateDetails a = new CustomerUpdateDetails.Builder().Copy(customerUpdateDetails).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String name) {

    }

    public Set<CustomerUpdateDetails>getAll(){
        return this.customerUpdateDetails;
    }
}

