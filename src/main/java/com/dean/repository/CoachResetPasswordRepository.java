package com.dean.repository;

import com.dean.domain.CoachResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachResetPasswordRepository extends IRepository<CoachResetPassword,String> {
    Set<CoachResetPassword>getAll();
}
