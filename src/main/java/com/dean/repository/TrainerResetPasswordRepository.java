package com.dean.repository;

import com.dean.domain.TrainerResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerResetPasswordRepository extends IRepository<TrainerResetPassword,String> {
    Set<TrainerResetPassword> getAll();
}
