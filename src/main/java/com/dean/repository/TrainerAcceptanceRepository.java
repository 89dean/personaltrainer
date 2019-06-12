package com.dean.repository;

import com.dean.domain.TrainerAcceptance;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerAcceptanceRepository extends IRepository<TrainerAcceptance,String> {
    Set<TrainerAcceptance> getAll();
}
