package com.dean.repository.impl;

import com.dean.domain.TrainerRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerRegistrationRepository extends IRepository {
    Set<TrainerRegistration> getAll();
}
