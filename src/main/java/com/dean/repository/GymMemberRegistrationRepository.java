package com.dean.repository;

import com.dean.domain.GymMemberRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface GymMemberRegistrationRepository extends JpaRepository<GymMemberRegistration,String> {
//    Collection<GymMemberRegistration> getAll();
}
