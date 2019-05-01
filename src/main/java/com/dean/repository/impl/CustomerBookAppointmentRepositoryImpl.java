package com.dean.repository.impl;

import com.dean.domain.CustomerBookAppointment;

import java.util.HashSet;
import java.util.Set;

public class CustomerBookAppointmentRepositoryImpl implements CustomerBookAppointmentRepository {

    private static CustomerBookAppointmentRepositoryImpl repository = null;
    private Set<CustomerBookAppointment> customerBookAppointment;

    private CustomerBookAppointmentRepositoryImpl(){
        this.customerBookAppointment = new HashSet<>();
    }

    public static CustomerBookAppointmentRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerBookAppointmentRepositoryImpl();
        return repository;
    }

    public CustomerBookAppointment create(CustomerBookAppointment customerBookAppointment){
        this.customerBookAppointment.add(customerBookAppointment);
        return customerBookAppointment;
    }
    public void delete(CustomerBookAppointment customerBookAppointment){
        this.customerBookAppointment.remove(customerBookAppointment);
    }
    public CustomerBookAppointment read(final String name){
        return findMessage(name);

    }

    private CustomerBookAppointment findMessage(String customerBookAppointment) {
        for(CustomerBookAppointment c: this.customerBookAppointment){
            if(c.getName().equals(customerBookAppointment)) return c;
        }
        return null;
    }

    public CustomerBookAppointment update(CustomerBookAppointment customerBookAppointment){
        CustomerBookAppointment c = findMessage(customerBookAppointment.getName());
        if(c != null){
            CustomerBookAppointment a = new CustomerBookAppointment.Builder().Copy(customerBookAppointment).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<CustomerBookAppointment>getAll(){
        return this.customerBookAppointment;
    }
}
