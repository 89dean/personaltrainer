package com.dean.repository.impl;

import com.dean.domain.TrainerUpdateDetails;
import com.dean.repository.TrainerUpdateDetailsRepository;

import java.util.*;

public class TrainerUpdateDetailsRepositoryImpl implements TrainerUpdateDetailsRepository {

    private static TrainerUpdateDetailsRepositoryImpl repository = null;
    private Set<TrainerUpdateDetails> trainerUpdateDetails;

    private TrainerUpdateDetailsRepositoryImpl(){

        this.trainerUpdateDetails = new HashSet<>();
    }
    private TrainerUpdateDetails findname(String name) {
        return this.trainerUpdateDetails.stream()
                .filter(trainerUpdateDetails -> trainerUpdateDetails.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static TrainerUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerUpdateDetailsRepositoryImpl();
        return repository;
    }
    public TrainerUpdateDetails create(TrainerUpdateDetails trainerUpdateDetails){
        this.trainerUpdateDetails.add(trainerUpdateDetails);
        return trainerUpdateDetails;
    }
    public TrainerUpdateDetails read(String name){
        TrainerUpdateDetails trainerUpdateDetails = findname(name);
        return trainerUpdateDetails;
    }
    public TrainerUpdateDetails update(TrainerUpdateDetails trainerUpdateDetails){
        TrainerUpdateDetails toDelete = findname(trainerUpdateDetails.getName());
        if(toDelete != null) {
            this.trainerUpdateDetails.remove(toDelete);
            return create(trainerUpdateDetails);
        }
        return null;
    }
    public void delete(String name){
        TrainerUpdateDetails trainerUpdateDetails = findname(name);
        if (trainerUpdateDetails != null) this.trainerUpdateDetails.remove(name);
    }

    public Set<TrainerUpdateDetails>getAll(){
        return this.trainerUpdateDetails;
    }

}

