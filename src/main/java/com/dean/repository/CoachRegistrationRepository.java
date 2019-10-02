package com.dean.repository;

import com.dean.domain.CoachRegistration;
import com.dean.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface CoachRegistrationRepository extends JpaRepository<CoachRegistration,String> {
//    Collection<CoachRegistration> getAll();
//    CoachRegistration retrieveByDesc(String coachRegistration);
}
