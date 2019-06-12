package com.dean.repository;

import com.dean.domain.CoachUpdateDetails;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachUpdateDetailsRepository extends IRepository<CoachUpdateDetails,String> {
    Set<CoachUpdateDetails>getAll();
}
