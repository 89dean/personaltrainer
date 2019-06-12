package com.dean.repository;

import com.dean.domain.CustomerResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CustomerResetPasswordRepository extends IRepository<CustomerResetPassword,String> {
    Set<CustomerResetPassword> getAll();
}
