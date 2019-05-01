package com.dean.repository.impl;

import com.dean.domain.GymMemeberRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberRegistrationRepository extends IRepository<GymMemeberRegistration,String> {
    Set<GymMemeberRegistration>getAll();
}
