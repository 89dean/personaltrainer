package com.dean.repository.impl;

import com.dean.domain.TrainerRegistration;

import java.util.*;

public class TrainerRegistrationRepositoryImpl implements TrainerRegistrationRepository {

    private static TrainerRegistrationRepositoryImpl repository = null;
    private Map<String,TrainerRegistration> trainerRegistration;

    private TrainerRegistrationRepositoryImpl(){
        this.trainerRegistration = new HashMap<>();
    }

    public static TrainerRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerRegistrationRepositoryImpl();
        return repository;
    }

    public TrainerRegistration create(TrainerRegistration trainerRegistration){
        this.trainerRegistration.put(trainerRegistration.getId(),trainerRegistration);
        return trainerRegistration;
    }
    public TrainerRegistration read(String id){
        return this.trainerRegistration.get(id);
    }
    public TrainerRegistration update(TrainerRegistration trainerRegistration){
        this.trainerRegistration.replace(trainerRegistration.getId(),trainerRegistration);
        return this.trainerRegistration.get(trainerRegistration.getId());
    }
    public void delete(String id){
        this.trainerRegistration.remove(id);
    }

    public Set<TrainerRegistration>getAll(){
        Collection<TrainerRegistration> trainerRegistration = this.trainerRegistration.values();
        Set<TrainerRegistration> set = new HashSet<>();
        set.addAll(trainerRegistration);
        return set;
    }
}
