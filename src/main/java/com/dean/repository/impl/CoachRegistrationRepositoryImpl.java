package com.dean.repository.impl;

import com.dean.domain.CoachRegistration;

import java.util.*;

public class CoachRegistrationRepositoryImpl implements CoachRegistrationRepository {

    private static CoachRegistrationRepositoryImpl repository = null;
    private Map<String,CoachRegistration> coachRegistration;

    private CoachRegistrationRepositoryImpl(){

        this.coachRegistration = new HashMap<>();
    }

    public static CoachRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachRegistrationRepositoryImpl();
        return repository;
    }

    public CoachRegistration create(CoachRegistration coachRegistration){
        this.coachRegistration.put(coachRegistration.getId(),coachRegistration);
        return coachRegistration;
    }
    public CoachRegistration read(String id){
        return this.coachRegistration.get(id);
    }
    public CoachRegistration update(CoachRegistration coachRegistration){
        this.coachRegistration.replace(coachRegistration.getId(),coachRegistration);
        return this.coachRegistration.get(coachRegistration.getId());
    }
    public void delete(String id){
        this.coachRegistration.remove(id);
    }

    public Set<CoachRegistration>getAll(){
        Collection<CoachRegistration> coachLogin = this.coachRegistration.values();
        Set<CoachRegistration> set = new HashSet<>();
        set.addAll(coachLogin);
        return set;
    }
}

