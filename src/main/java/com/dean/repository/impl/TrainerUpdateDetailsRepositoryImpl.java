package com.dean.repository.impl;

import com.dean.domain.TrainerUpdateDetails;

import java.util.*;

public class TrainerUpdateDetailsRepositoryImpl implements TrainerUpdateDetailsRepository {

    private static TrainerUpdateDetailsRepositoryImpl repository = null;
    private Map<String,TrainerUpdateDetails> trainerUpdateDetails;

    private TrainerUpdateDetailsRepositoryImpl(){

        this.trainerUpdateDetails = new HashMap<>();
    }

    public static TrainerUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerUpdateDetailsRepositoryImpl();
        return repository;
    }
    public TrainerUpdateDetails create(TrainerUpdateDetails trainerUpdateDetails){
        this.trainerUpdateDetails.put(trainerUpdateDetails.getName(),trainerUpdateDetails);
        return trainerUpdateDetails;
    }
    public TrainerUpdateDetails read(String name){

        return this.trainerUpdateDetails.get(name);
    }
    public TrainerUpdateDetails update(TrainerUpdateDetails trainerUpdateDetails){
        this.trainerUpdateDetails.replace(trainerUpdateDetails.getName(),trainerUpdateDetails);
        return this.trainerUpdateDetails.get(trainerUpdateDetails.getName());
    }
    public void delete(String name){
        this.trainerUpdateDetails.remove(name);
    }

    public Set<TrainerUpdateDetails>getAll(){
        Collection<TrainerUpdateDetails> trainerUpdateDetails = this.trainerUpdateDetails.values();
        Set<TrainerUpdateDetails> set = new HashSet<>();
        set.addAll(trainerUpdateDetails);
        return set;
    }

}

