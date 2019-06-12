package com.dean.repository;

import com.dean.domain.CoachLogin;
import com.dean.repository.IRepository;

import java.util.Set;

public interface CoachLoginRepository extends IRepository<CoachLogin,String> {
    Set<CoachLogin>getAll();
}
