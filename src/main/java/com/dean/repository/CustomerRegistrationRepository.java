package com.dean.repository;

import com.dean.domain.CustomerRegistration;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerRegistrationRepository extends IRepository<CustomerRegistration,String> {
    Set<CustomerRegistration>getAll();
}
