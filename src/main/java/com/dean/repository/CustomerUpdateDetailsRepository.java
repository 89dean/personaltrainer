package com.dean.repository;

import com.dean.domain.CustomerUpdateDetails;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerUpdateDetailsRepository extends IRepository<CustomerUpdateDetails,String> {
    Set<CustomerUpdateDetails> getAll();
}
