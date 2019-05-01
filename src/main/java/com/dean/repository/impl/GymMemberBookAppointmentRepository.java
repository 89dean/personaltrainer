package com.dean.repository.impl;

import com.dean.domain.GymMemberBookAppointment;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberBookAppointmentRepository extends IRepository<GymMemberBookAppointment,String> {
    Set<GymMemberBookAppointment>getAll();
}
