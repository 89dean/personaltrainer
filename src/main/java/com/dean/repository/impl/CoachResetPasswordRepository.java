package com.dean.repository.impl;

import com.dean.domain.CoachResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachResetPasswordRepository extends IRepository<CoachResetPassword,String> {
    Set<CoachResetPassword>getAll();
}