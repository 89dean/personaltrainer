package com.dean.repository.impl;

import com.dean.domain.TrainerAcceptance;

import java.util.*;

public class TrainerAcceptanceRepositoryImpl implements TrainerAcceptanceRepository {

    private static TrainerAcceptanceRepositoryImpl repository = null;
    private Map<String,TrainerAcceptance> trainerAcceptance;

    private TrainerAcceptanceRepositoryImpl(){

        this.trainerAcceptance = new HashMap<>();
    }

    public static TrainerAcceptanceRepositoryImpl  getRepository(){
        if (repository==null) repository = new TrainerAcceptanceRepositoryImpl();
        return repository;
    }

    public TrainerAcceptance create(TrainerAcceptance trainerAcceptance){
        this.trainerAcceptance.put(trainerAcceptance.getMessage(),trainerAcceptance);
        return trainerAcceptance;
    }
    public TrainerAcceptance read(final String message){
        return this.trainerAcceptance.get(message);

    }
    public TrainerAcceptance update(TrainerAcceptance trainerAcceptance){
        this.trainerAcceptance.replace(trainerAcceptance.getMessage(),trainerAcceptance);
        return this.trainerAcceptance.get(trainerAcceptance.getMessage());
    }
    public void delete(String message){
        this.trainerAcceptance.remove(message);
    }

    public Set<TrainerAcceptance>getAll() {
        Collection<TrainerAcceptance> trainerAcceptance = this.trainerAcceptance.values();
        Set<TrainerAcceptance> set = new HashSet<>();
        set.addAll(trainerAcceptance);
        return set;
    }
}
