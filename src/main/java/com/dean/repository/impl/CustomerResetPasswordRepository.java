package com.dean.repository.impl;

import com.dean.domain.CustomerResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerResetPasswordRepository extends IRepository<CustomerResetPassword,String> {
    Set<CustomerResetPassword> getAll();
}
