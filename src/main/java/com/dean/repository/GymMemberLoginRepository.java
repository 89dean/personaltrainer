package com.dean.repository;

import com.dean.domain.GymMemberLogin;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GymMemberLoginRepository extends IRepository<GymMemberLogin,String>{
    Set<GymMemberLogin>getAll();
}
