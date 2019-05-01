package com.dean.repository.impl;

import com.dean.domain.CoachUpdateDetails;

import java.util.HashSet;
import java.util.Set;

public class CoachUpdateDetailsRepositoryImpl implements CoachUpdateDetailsRepository {

    private static CoachUpdateDetailsRepositoryImpl repository = null;
    private Set<CoachUpdateDetails> coachUpdateDetails;

    private CoachUpdateDetailsRepositoryImpl(){
        this.coachUpdateDetails = new HashSet<>();
    }

    public static CoachUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachUpdateDetailsRepositoryImpl();
        return repository;
    }

    public CoachUpdateDetails create(CoachUpdateDetails coachUpdateDetails){
        this.coachUpdateDetails.add(coachUpdateDetails);
        return coachUpdateDetails;
    }
    public void delete(CoachUpdateDetails coachUpdateDetails){
        this.coachUpdateDetails.remove(coachUpdateDetails);
    }
    public CoachUpdateDetails read(final String name){
        return findMessage(name);

    }

    private CoachUpdateDetails findMessage(String coachUpdateDetails) {
        for(CoachUpdateDetails c: this.coachUpdateDetails){
            if(c.getName().equals(coachUpdateDetails)) return c;
        }
        return null;
    }

    public CoachUpdateDetails update(CoachUpdateDetails coachUpdateDetails){
        CoachUpdateDetails c = findMessage(coachUpdateDetails.getName());
        if(c != null){
            CoachUpdateDetails a = new CoachUpdateDetails.Builder().Copy(coachUpdateDetails).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<CoachUpdateDetails>getAll(){
        return this.coachUpdateDetails;
    }
}
