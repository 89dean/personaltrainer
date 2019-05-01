package com.dean.repository.impl;

import com.dean.domain.CustomerRegistration;

import java.util.HashSet;
import java.util.Set;

public class CustomerRegistrationRepositoryImpl implements CustomerRegistrationRepository {

    private static CustomerRegistrationRepositoryImpl repository = null;
    private Set<CustomerRegistration> customerRegistration;

    private CustomerRegistrationRepositoryImpl(){
        this.customerRegistration = new HashSet<>();
    }

    public static CustomerRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerRegistrationRepositoryImpl();
        return repository;
    }

    public CustomerRegistration create(CustomerRegistration customerRegistration){
        this.customerRegistration.add(customerRegistration);
        return customerRegistration;
    }
    public void delete(CustomerRegistration customerRegistration){
        this.customerRegistration.remove(customerRegistration);
    }
    public CustomerRegistration read(final String id){
        return findMessage(id);

    }

    private CustomerRegistration findMessage(String customerRegistration) {
        for(CustomerRegistration c: this.customerRegistration){
            if(c.getId().equals(customerRegistration)) return c;
        }
        return null;
    }

    public CustomerRegistration update(CustomerRegistration customerRegistration){
        CustomerRegistration c = findMessage(customerRegistration.getId());
        if(c != null){
            CustomerRegistration a = new CustomerRegistration.Builder().Copy(customerRegistration).build();
            return create(a);
        }
        return null;
    }
    @Override
    public void delete(String message) {

    }

    public Set<CustomerRegistration>getAll(){
        return this.customerRegistration;
    }



}
