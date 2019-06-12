package com.dean.repository.impl;

import com.dean.domain.CustomerRegistration;
import com.dean.repository.CustomerRegistrationRepository;

import java.util.*;

public class CustomerRegistrationRepositoryImpl implements CustomerRegistrationRepository {

    private static CustomerRegistrationRepositoryImpl repository = null;
    private Set<CustomerRegistration> customerRegistration;

    private CustomerRegistrationRepositoryImpl(){

        this.customerRegistration = new HashSet<>();
    }
    private CustomerRegistration findId(String id) {
        return this.customerRegistration.stream()
                .filter(customerRegistration -> customerRegistration.getEmailAddress().trim().equals(id))
                .findAny()
                .orElse(null);
    }

    public static CustomerRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerRegistrationRepositoryImpl();
        return repository;
    }

    public CustomerRegistration create(CustomerRegistration customerRegistration){
        this.customerRegistration.add(customerRegistration);
        return customerRegistration;
    }
    public CustomerRegistration read(String id){

        CustomerRegistration customerRegistration = findId(id);
        return customerRegistration;
    }
    public CustomerRegistration update(CustomerRegistration customerRegistration){
        CustomerRegistration toDelete = findId(customerRegistration.getId());
        if(toDelete != null) {
            this.customerRegistration.remove(toDelete);
            return create(customerRegistration);
        }
        return null;
    }
    public void delete(String id){
        CustomerRegistration customerRegistration = findId(id);
        if (customerRegistration != null) this.customerRegistration.remove(id);
    }

    public Set<CustomerRegistration>getAll(){
        return this.customerRegistration;
    }

}
