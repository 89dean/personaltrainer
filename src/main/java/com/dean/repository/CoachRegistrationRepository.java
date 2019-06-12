package com.dean.repository;

import com.dean.domain.CoachRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachRegistrationRepository extends IRepository <CoachRegistration,String> {
    Set<CoachRegistration>getAll();
}
