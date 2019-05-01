package com.dean.repository.impl;

import com.dean.domain.CoachRegistration;

import java.util.HashSet;
import java.util.Set;

public class CoachRegistrationRepositoryImpl implements CoachRegistrationRepository {

    private static CoachRegistrationRepositoryImpl repository = null;
    private Set<CoachRegistration> coachRegistration;

    private CoachRegistrationRepositoryImpl(){
        this.coachRegistration = new HashSet<>();
    }

    public static CoachRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachRegistrationRepositoryImpl();
        return repository;
    }

    public CoachRegistration create(CoachRegistration coachRegistration){
        this.coachRegistration.add(coachRegistration);
        return coachRegistration;
    }
    public void delete(CoachRegistration coachRegistration){
        this.coachRegistration.remove(coachRegistration);
    }
    public CoachRegistration read(final String id){
        return findMessage(id);

    }

    private CoachRegistration findMessage(String coachRegistration) {
        for(CoachRegistration c: this.coachRegistration){
            if(c.getId().equals(coachRegistration)) return c;
        }
        return null;
    }

    public CoachRegistration update(CoachRegistration coachRegistration){
        CoachRegistration c = findMessage(coachRegistration.getId());
        if(c != null){
            CoachRegistration a = new CoachRegistration.Builder().Copy(coachRegistration).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<CoachRegistration>getAll(){
        return this.coachRegistration;
    }
}

