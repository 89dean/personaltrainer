package com.dean.repository.impl;

import com.dean.domain.CoachAcceptance;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachAcceptanceRepository extends IRepository<CoachAcceptance,String> {
    Set<CoachAcceptance>getAll();
}
