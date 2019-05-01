package com.dean.repository.impl;

import com.dean.domain.TrainerUpdateDetails;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerUpdateDetailsRepository extends IRepository<TrainerUpdateDetails,String> {
    Set<TrainerUpdateDetails> getAll();
}
