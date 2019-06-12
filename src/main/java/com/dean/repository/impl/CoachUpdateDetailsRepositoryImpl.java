package com.dean.repository.impl;

import com.dean.domain.CoachUpdateDetails;
import com.dean.repository.CoachUpdateDetailsRepository;

import java.util.*;

public class CoachUpdateDetailsRepositoryImpl implements CoachUpdateDetailsRepository {

    private static CoachUpdateDetailsRepositoryImpl repository = null;
    private Set<CoachUpdateDetails> coachUpdateDetails;

    private CoachUpdateDetailsRepositoryImpl(){

        this.coachUpdateDetails = new HashSet<>();
    }
    private CoachUpdateDetails findName(String name) {
        return this.coachUpdateDetails.stream()
                .filter(coachUpdateDetails -> coachUpdateDetails.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static CoachUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachUpdateDetailsRepositoryImpl();
        return repository;
    }

    public CoachUpdateDetails create(CoachUpdateDetails coachUpdateDetails){
        this.coachUpdateDetails.add(coachUpdateDetails);
        return coachUpdateDetails;
    }
    public CoachUpdateDetails read(String name){
        CoachUpdateDetails coachUpdateDetails = findName(name);
        return coachUpdateDetails;
    }
    public CoachUpdateDetails update(CoachUpdateDetails coachUpdateDetails){
        CoachUpdateDetails toDelete = findName(coachUpdateDetails.getName());
        if(toDelete != null) {
            this.coachUpdateDetails.remove(toDelete);
            return create(coachUpdateDetails);
        }
        return null;
    }
    public void delete(String name){
        CoachUpdateDetails coachUpdateDetails = findName(name);
        if (coachUpdateDetails != null) this.coachUpdateDetails.remove(name);
    }

    public Set<CoachUpdateDetails>getAll(){
        return this.coachUpdateDetails;
    }
}
