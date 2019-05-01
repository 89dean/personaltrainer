package com.dean.repository.impl;

import com.dean.domain.CustomerBookAppointment;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerBookAppointmentRepository extends IRepository<CustomerBookAppointment,String> {
    Set<CustomerBookAppointment> getAll();
}
