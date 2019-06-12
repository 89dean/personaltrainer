package com.dean.repository.impl;

import com.dean.domain.TrainerRegistration;
import com.dean.repository.TrainerRegistrationRepository;

import java.util.*;

public class TrainerRegistrationRepositoryImpl implements TrainerRegistrationRepository {

    private static TrainerRegistrationRepositoryImpl repository = null;
    private Set<TrainerRegistration> trainerRegistration;

    private TrainerRegistrationRepositoryImpl(){

        this.trainerRegistration = new HashSet<>();
    }
    private TrainerRegistration findid(String id) {
        return this.trainerRegistration.stream()
                .filter(trainerRegistration -> trainerRegistration.getId().trim().equals(id))
                .findAny()
                .orElse(null);
    }

    public static TrainerRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerRegistrationRepositoryImpl();
        return repository;
    }

    public TrainerRegistration create(TrainerRegistration trainerRegistration){
        this.trainerRegistration.add(trainerRegistration);
        return trainerRegistration;
    }
    public TrainerRegistration read(String id){
        TrainerRegistration trainerRegistration = findid(id);
        return trainerRegistration;
    }
    public TrainerRegistration update(TrainerRegistration trainerRegistration){
        TrainerRegistration toDelete = findid(trainerRegistration.getEmailAddress());
        if(toDelete != null) {
            this.trainerRegistration.remove(toDelete);
            return create(trainerRegistration);
        }
        return null;
    }
    public void delete(String id){
        TrainerRegistration trainerRegistration = findid(id);
        if (trainerRegistration != null) this.trainerRegistration.remove(id);
    }

    public Set<TrainerRegistration>getAll(){
        return this.trainerRegistration;
    }
}
