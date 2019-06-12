package com.dean.repository;

import com.dean.domain.GymMemberRegistration;

import java.util.Set;

public interface GymMemberRegistrationRepository extends IRepository<GymMemberRegistration,String> {
    Set<GymMemberRegistration>getAll();
}
