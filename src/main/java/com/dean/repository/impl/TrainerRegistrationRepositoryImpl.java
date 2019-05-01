package com.dean.repository.impl;

import com.dean.domain.TrainerRegistration;

import java.util.HashSet;
import java.util.Set;

public class TrainerRegistrationRepositoryImpl implements TrainerRegistrationRepository {

    private static TrainerRegistrationRepositoryImpl repository = null;
    private Set<TrainerRegistration> trainerRegistration;

    private TrainerRegistrationRepositoryImpl(){
        this.trainerRegistration = new HashSet<>();
    }

    public static TrainerRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerRegistrationRepositoryImpl();
        return repository;
    }

    public TrainerRegistration create(TrainerRegistration trainerRegistration){
        this.trainerRegistration.add(trainerRegistration);
        return trainerRegistration;
    }
    public void delete(TrainerRegistration trainerRegistration){
        this.trainerRegistration.remove(trainerRegistration);
    }
    public TrainerRegistration read(final String id){
        return findMessage(id);

    }

    private TrainerRegistration findMessage(String trainerRegistration) {
        for(TrainerRegistration c: this.trainerRegistration){
            if(c.getId().equals(trainerRegistration)) return c;
        }
        return null;
    }

    public TrainerRegistration update(TrainerRegistration trainerRegistration){
        TrainerRegistration c = findMessage(trainerRegistration.getId());
        if(c != null){
            TrainerRegistration a = new TrainerRegistration.Builder().Copy(trainerRegistration).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<TrainerRegistration>getAll(){
        return this.trainerRegistration;
    }
}
