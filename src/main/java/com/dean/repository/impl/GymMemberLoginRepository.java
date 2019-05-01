package com.dean.repository.impl;

import com.dean.domain.GymMemberLogin;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberLoginRepository extends IRepository<GymMemberLogin,String>{
    Set<GymMemberLogin>getAll();
}
