package com.dean.repository.impl;

import com.dean.domain.TrainerResetPassword;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerResetPasswordRepository extends IRepository {
    Set<TrainerResetPassword> getAll();
}
