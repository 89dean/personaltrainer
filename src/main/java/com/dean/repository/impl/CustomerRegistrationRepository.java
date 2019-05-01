package com.dean.repository.impl;

import com.dean.domain.CustomerRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerRegistrationRepository extends IRepository {
    Set<CustomerRegistration>getAll();
}
