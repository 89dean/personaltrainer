package com.dean.repository;

import com.dean.domain.CustomerBookAppointment;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerBookAppointmentRepository extends IRepository<CustomerBookAppointment,String> {
    Set<CustomerBookAppointment> getAll();
}
