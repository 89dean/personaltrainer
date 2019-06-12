package com.dean.repository;

import com.dean.domain.GymMemberResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberResetPasswordRepository extends IRepository<GymMemberResetPassword,String> {
    Set<GymMemberResetPassword> getAll();
}
