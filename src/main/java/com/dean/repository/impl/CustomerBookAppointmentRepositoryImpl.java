package com.dean.repository.impl;

import com.dean.domain.CustomerBookAppointment;
import com.dean.repository.CustomerBookAppointmentRepository;

import java.util.*;

public class CustomerBookAppointmentRepositoryImpl implements CustomerBookAppointmentRepository {

    private static CustomerBookAppointmentRepositoryImpl repository = null;
    private Set<CustomerBookAppointment> customerBookAppointment;

    private CustomerBookAppointmentRepositoryImpl(){

        this.customerBookAppointment = new HashSet<>();
    }
    private CustomerBookAppointment findName(String name) {
        return this.customerBookAppointment.stream()
                .filter(customerBookAppointment -> customerBookAppointment.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static CustomerBookAppointmentRepositoryImpl  getRepository(){
        if (repository==null)repository = new CustomerBookAppointmentRepositoryImpl();
        return repository;
    }

    public CustomerBookAppointment create(CustomerBookAppointment customerBookAppointment){
        this.customerBookAppointment.add(customerBookAppointment);
        return customerBookAppointment;
    }
    public CustomerBookAppointment read(String name){
        CustomerBookAppointment customerBookAppointment = findName(name);
        return customerBookAppointment;
    }
    public CustomerBookAppointment update(CustomerBookAppointment customerBookAppointment){
        CustomerBookAppointment toDelete = findName(customerBookAppointment.getName());
        if(toDelete != null) {
            this.customerBookAppointment.remove(toDelete);
            return create(customerBookAppointment);
        }
        return null;
    }
    public void delete(String name){
        CustomerBookAppointment coachResetPassword = findName(name);
        if (customerBookAppointment != null) this.customerBookAppointment.remove(name);

       }

    public Set<CustomerBookAppointment>getAll(){
        return this.customerBookAppointment;
    }
}
