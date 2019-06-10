package com.dean.repository.impl;

import com.dean.domain.CustomerBookAppointment;

import java.util.*;

public class CustomerBookAppointmentRepositoryImpl implements CustomerBookAppointmentRepository {

    private static CustomerBookAppointmentRepositoryImpl repository = null;
    private Map<String,CustomerBookAppointment> customerBookAppointment;

    private CustomerBookAppointmentRepositoryImpl(){

        this.customerBookAppointment = new HashMap<>();
    }

    public static CustomerBookAppointmentRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerBookAppointmentRepositoryImpl();
        return repository;
    }

    public CustomerBookAppointment create(CustomerBookAppointment customerBookAppointment){
        this.customerBookAppointment.put(customerBookAppointment.getName(),customerBookAppointment);
        return customerBookAppointment;
    }
    public CustomerBookAppointment read(String name){
        return this.customerBookAppointment.get(name);
    }
    public CustomerBookAppointment update(CustomerBookAppointment customerBookAppointment){
        this.customerBookAppointment.replace(customerBookAppointment.getName(),customerBookAppointment);
        return this.customerBookAppointment.get(customerBookAppointment.getName());
    }
    public void delete(String name){
        this.customerBookAppointment.remove(name);
    }

    public Set<CustomerBookAppointment>getAll(){
        Collection<CustomerBookAppointment> customerBookAppointment = this.customerBookAppointment.values();
        Set<CustomerBookAppointment> set = new HashSet<>();
        set.addAll(customerBookAppointment);
        return set;
    }
}
