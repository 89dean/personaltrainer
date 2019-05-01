package com.dean.repository.impl;

import com.dean.domain.TrainerUpdateDetails;

import java.util.HashSet;
import java.util.Set;

public class TrainerUpdateDetailsRepositoryImpl implements TrainerUpdateDetailsRepository {

    private static TrainerUpdateDetailsRepositoryImpl repository = null;
    private Set<TrainerUpdateDetails> trainerUpdateDetails;

    private TrainerUpdateDetailsRepositoryImpl(){
        this.trainerUpdateDetails = new HashSet<>();
    }

    public static TrainerUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerUpdateDetailsRepositoryImpl();
        return repository;
    }

    public TrainerUpdateDetails create(TrainerUpdateDetails trainerUpdateDetails){
        this.trainerUpdateDetails.add(trainerUpdateDetails);
        return trainerUpdateDetails;
    }
    public void delete(TrainerUpdateDetails trainerUpdateDetails){
        this.trainerUpdateDetails.remove(trainerUpdateDetails);
    }
    public TrainerUpdateDetails read(final String name){
        return findMessage(name);

    }

    private TrainerUpdateDetails findMessage(String trainerUpdateDetails) {
        for(TrainerUpdateDetails c: this.trainerUpdateDetails){
            if(c.getName().equals(trainerUpdateDetails)) return c;
        }
        return null;
    }

    public TrainerUpdateDetails update(TrainerUpdateDetails trainerUpdateDetails){
        TrainerUpdateDetails c = findMessage(trainerUpdateDetails.getName());
        if(c != null){
            TrainerUpdateDetails a = new TrainerUpdateDetails.Builder().Copy(trainerUpdateDetails).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<TrainerUpdateDetails>getAll(){
        return this.trainerUpdateDetails;
    }
}

