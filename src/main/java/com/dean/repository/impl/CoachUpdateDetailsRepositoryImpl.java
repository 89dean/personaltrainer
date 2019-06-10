package com.dean.repository.impl;

import com.dean.domain.CoachUpdateDetails;

import java.util.*;

public class CoachUpdateDetailsRepositoryImpl implements CoachUpdateDetailsRepository {

    private static CoachUpdateDetailsRepositoryImpl repository = null;
    private Map<String,CoachUpdateDetails> coachUpdateDetails;

    private CoachUpdateDetailsRepositoryImpl(){

        this.coachUpdateDetails = new HashMap<>();
    }

    public static CoachUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachUpdateDetailsRepositoryImpl();
        return repository;
    }

    public CoachUpdateDetails create(CoachUpdateDetails coachUpdateDetails){
        this.coachUpdateDetails.put(coachUpdateDetails.getName(),coachUpdateDetails);
        return coachUpdateDetails;
    }
    public CoachUpdateDetails read(String name){
        return this.coachUpdateDetails.get(name);
    }
    public CoachUpdateDetails update(CoachUpdateDetails coachUpdateDetails){
        this.coachUpdateDetails.replace(coachUpdateDetails.getName(),coachUpdateDetails);
        return this.coachUpdateDetails.get(coachUpdateDetails.getName());
    }
    public void delete(String name){
        this.coachUpdateDetails.remove(name);
    }

    public Set<CoachUpdateDetails>getAll(){
        Collection<CoachUpdateDetails> coachUpdateDetails = this.coachUpdateDetails.values();
        Set<CoachUpdateDetails> set = new HashSet<>();
        set.addAll(coachUpdateDetails);
        return set;
    }
}
