package com.dean.repository.impl;

import com.dean.domain.CustomerLogin;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerLoginRepository extends IRepository <CustomerLogin,String> {
    Set<CustomerLogin> getAll();
}
