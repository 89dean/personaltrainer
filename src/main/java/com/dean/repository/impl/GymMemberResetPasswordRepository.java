package com.dean.repository.impl;

import com.dean.domain.GymMemberResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberResetPasswordRepository extends IRepository<GymMemberResetPassword,String> {
    Set<GymMemberResetPassword> getAll();
}
