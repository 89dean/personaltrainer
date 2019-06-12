package com.dean.repository.impl;

import com.dean.domain.CoachRegistration;
import com.dean.repository.CoachRegistrationRepository;

import java.util.*;

public class CoachRegistrationRepositoryImpl implements CoachRegistrationRepository {

    private static CoachRegistrationRepositoryImpl repository = null;
    private Set<CoachRegistration> coachRegistration;

    private CoachRegistrationRepositoryImpl(){

        this.coachRegistration = new HashSet<>();
    }
    private CoachRegistration findId(String id) {
        return this.coachRegistration.stream()
                .filter(coachRegistration -> coachRegistration.getId().trim().equals(id))
                .findAny()
                .orElse(null);
    }

    public static CoachRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachRegistrationRepositoryImpl();
        return repository;
    }

    public CoachRegistration create(CoachRegistration coachRegistration){
        this.coachRegistration.add(coachRegistration);
        return coachRegistration;
    }
    public CoachRegistration read(String id){
        CoachRegistration coachRegistration = findId(id);
        return coachRegistration;
    }
    public CoachRegistration update(CoachRegistration coachRegistration){
        CoachRegistration toDelete = findId(coachRegistration.getId());
        if(toDelete != null) {
            this.coachRegistration.remove(toDelete);
            return create(coachRegistration);
        }
        return null;
    }
    public void delete(String id){
        CoachRegistration coachRegistration = findId(id);
        if (coachRegistration != null) this.coachRegistration.remove(id);
    }

    public Set<CoachRegistration>getAll(){
        return this.coachRegistration;
    }
}

