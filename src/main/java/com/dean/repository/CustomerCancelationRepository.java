package com.dean.repository;

import com.dean.domain.CustomerCancelation;
import com.dean.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface CustomerCancelationRepository extends JpaRepository<CustomerCancelation,String> {
//    Collection<CustomerCancelation> getAll();
}
