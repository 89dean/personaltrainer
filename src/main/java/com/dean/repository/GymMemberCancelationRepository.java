package com.dean.repository;

import com.dean.domain.GymMemberCancelation;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberCancelationRepository extends IRepository<GymMemberCancelation,String> {
    Set<GymMemberCancelation> getAll();
}