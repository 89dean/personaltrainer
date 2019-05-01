package com.dean.repository.impl;

import com.dean.domain.TrainerAcceptance;
import com.dean.repository.IRepository;

import java.util.Set;

public interface TrainerAcceptanceRepository extends IRepository {
    Set<TrainerAcceptance> getAll();
}
