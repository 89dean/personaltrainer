package com.dean.repository.impl;

import com.dean.domain.CustomerRegistration;

import java.util.*;

public class CustomerRegistrationRepositoryImpl implements CustomerRegistrationRepository {

    private static CustomerRegistrationRepositoryImpl repository = null;
    private Map<String,CustomerRegistration> customerRegistration;

    private CustomerRegistrationRepositoryImpl(){
        this.customerRegistration = new HashMap<>();
    }

    public static CustomerRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerRegistrationRepositoryImpl();
        return repository;
    }

    public CustomerRegistration create(CustomerRegistration customerRegistration){
        this.customerRegistration.put(customerRegistration.getId(),customerRegistration);
        return customerRegistration;
    }
    public CustomerRegistration read(String id){
        return this.customerRegistration.get(id);
    }
    public CustomerRegistration update(CustomerRegistration customerRegistration){
        this.customerRegistration.replace(customerRegistration.getId(),customerRegistration);
        return this.customerRegistration.get(customerRegistration.getId());
    }
    public void delete(String id){
        this.customerRegistration.remove(id);
    }

    public Set<CustomerRegistration>getAll(){
        Collection<CustomerRegistration> customerRegistration = this.customerRegistration.values();
        Set<CustomerRegistration> set = new HashSet<>();
        set.addAll(customerRegistration);
        return set;
    }

}
