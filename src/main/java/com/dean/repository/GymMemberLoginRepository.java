package com.dean.repository;

import com.dean.domain.GymMemberLogin;
import com.dean.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Repository
public interface GymMemberLoginRepository extends JpaRepository<GymMemberLogin,String> {
   // List<GymMemberLogin> getAll();
}
