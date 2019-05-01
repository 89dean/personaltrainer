package com.dean.repository.impl;

import com.dean.domain.CoachRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachRegistrationRepository extends IRepository <CoachRegistration,String> {
    Set<CoachRegistration>getAll();
}
