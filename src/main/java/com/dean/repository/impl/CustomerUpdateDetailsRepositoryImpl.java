package com.dean.repository.impl;

import com.dean.domain.CustomerUpdateDetails;
import com.dean.repository.CustomerUpdateDetailsRepository;

import java.util.*;

public class CustomerUpdateDetailsRepositoryImpl implements CustomerUpdateDetailsRepository {

    private static CustomerUpdateDetailsRepositoryImpl repository = null;
    private Set<CustomerUpdateDetails> customerUpdateDetails;

    private CustomerUpdateDetailsRepositoryImpl(){

        this.customerUpdateDetails = new HashSet<>();
    }
    private CustomerUpdateDetails findname(String name) {
        return this.customerUpdateDetails.stream()
                .filter(customerUpdateDetails -> customerUpdateDetails.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static CustomerUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerUpdateDetailsRepositoryImpl();
        return repository;
    }

    public CustomerUpdateDetails create(CustomerUpdateDetails customerUpdateDetails){
        this.customerUpdateDetails.add(customerUpdateDetails);
        return customerUpdateDetails;
    }
    public CustomerUpdateDetails read(String name){
        CustomerUpdateDetails customerUpdateDetails = findname(name);
        return customerUpdateDetails;
    }
    public CustomerUpdateDetails update(CustomerUpdateDetails customerUpdateDetails){
        CustomerUpdateDetails toDelete = findname(customerUpdateDetails.getName());
        if(toDelete != null) {
            this.customerUpdateDetails.remove(toDelete);
            return create(customerUpdateDetails);
        }
        return null;
    }
    public void delete(String name){
        CustomerUpdateDetails customerUpdateDetails = findname(name);
        if (customerUpdateDetails != null) this.customerUpdateDetails.remove(name);
    }

    public Set<CustomerUpdateDetails>getAll(){
        return this.customerUpdateDetails;
    }
}

