package com.dean.repository;

import com.dean.domain.TrainerLogin;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerLoginRepository extends IRepository<TrainerLogin,String> {
    Set<TrainerLogin> getAll();
}
