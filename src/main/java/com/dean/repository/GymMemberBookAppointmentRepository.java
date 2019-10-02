package com.dean.repository;

import com.dean.domain.GymMemberBookAppointment;
import com.dean.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface GymMemberBookAppointmentRepository extends JpaRepository<GymMemberBookAppointment,String> {
//    Collection<GymMemberBookAppointment> getAll();
}
