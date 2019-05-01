package com.dean.repository.impl;

import com.dean.domain.CustomerCancelation;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerCancelationRepository extends IRepository<CustomerCancelation,String> {
    Set<CustomerCancelation> getAll();
}
