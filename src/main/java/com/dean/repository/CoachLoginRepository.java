package com.dean.repository;

import com.dean.domain.CoachLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoachLoginRepository extends JpaRepository<CoachLogin,Integer> {

}
