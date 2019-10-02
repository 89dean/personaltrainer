package com.dean.repository;

import com.dean.domain.TrainerAcceptance;
import com.dean.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface TrainerAcceptanceRepository extends JpaRepository<TrainerAcceptance,String> {
//    Collection<TrainerAcceptance> getAll();
}
