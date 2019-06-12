package com.dean.repository.impl;

import com.dean.domain.TrainerAcceptance;
import com.dean.repository.TrainerAcceptanceRepository;

import java.util.*;

public class TrainerAcceptanceRepositoryImpl implements TrainerAcceptanceRepository {

    private static TrainerAcceptanceRepositoryImpl repository = null;
    private Set<TrainerAcceptance> trainerAcceptance;

    private TrainerAcceptanceRepositoryImpl(){

        this.trainerAcceptance = new HashSet<>();
    }
    private TrainerAcceptance findmessage(String message) {
        return this.trainerAcceptance.stream()
                .filter(trainerAcceptance -> trainerAcceptance.getMessage().trim().equals(message))
                .findAny()
                .orElse(null);
    }


    public static TrainerAcceptanceRepositoryImpl  getRepository(){
        if (repository==null) repository = new TrainerAcceptanceRepositoryImpl();
        return repository;
    }

    public TrainerAcceptance create(TrainerAcceptance trainerAcceptance){
        this.trainerAcceptance.add(trainerAcceptance);
        return trainerAcceptance;
    }
    public TrainerAcceptance read(final String message){
        TrainerAcceptance trainerAcceptance = findmessage(message);
        return trainerAcceptance;
    }
    public TrainerAcceptance update(TrainerAcceptance trainerAcceptance){
        TrainerAcceptance toDelete = findmessage(trainerAcceptance.getMessage());
        if(toDelete != null) {
            this.trainerAcceptance.remove(toDelete);
            return create(trainerAcceptance);
        }
        return null;
    }
    public void delete(String message){
        TrainerAcceptance trainerAcceptance = findmessage(message);
        if (trainerAcceptance!= null) this.trainerAcceptance.remove(message);
    }

    public Set<TrainerAcceptance>getAll() {
        return this.trainerAcceptance;
    }
}
