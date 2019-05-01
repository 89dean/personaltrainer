package com.dean.repository.impl;

import com.dean.domain.CustomerUpdateDetails;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerUpdateDetailsRepository extends IRepository {
    Set<CustomerUpdateDetails> getAll();
}
