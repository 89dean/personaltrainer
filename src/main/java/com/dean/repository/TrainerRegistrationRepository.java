package com.dean.repository;

import com.dean.domain.TrainerRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerRegistrationRepository extends IRepository<TrainerRegistration,String> {
    Set<TrainerRegistration> getAll();
}
