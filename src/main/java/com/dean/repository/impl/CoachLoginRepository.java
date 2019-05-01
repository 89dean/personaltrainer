package com.dean.repository.impl;

import com.dean.domain.CoachLogin;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachLoginRepository extends IRepository<CoachLogin,String> {
    Set<CoachLogin>getAll();
}
