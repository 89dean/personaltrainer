package com.dean.repository.impl;

import com.dean.domain.GymMemberUpdateDetails;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberUpdateDetailsRepository extends IRepository<GymMemberUpdateDetails,String> {
    Set<GymMemberUpdateDetails>getAll();
}
