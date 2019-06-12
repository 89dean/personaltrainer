package com.dean.repository;

import com.dean.domain.TrainerUpdateDetails;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerUpdateDetailsRepository extends IRepository<TrainerUpdateDetails,String> {
    Set<TrainerUpdateDetails> getAll();
}
