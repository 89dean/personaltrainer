package com.dean.repository;

import com.dean.domain.CoachLogin;
import com.dean.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface CoachLoginRepository extends JpaRepository<CoachLogin,String> {
//    Collection<CoachLogin> getAll();
//    CoachLogin retrieveByDesc(String loginDesc);
}
