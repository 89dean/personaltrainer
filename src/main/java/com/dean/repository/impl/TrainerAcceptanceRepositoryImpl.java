package com.dean.repository.impl;

import com.dean.domain.TrainerAcceptance;

import java.util.HashSet;
import java.util.Set;

public class TrainerAcceptanceRepositoryImpl implements TrainerAcceptanceRepository {

    private static TrainerAcceptanceRepositoryImpl repository = null;
    private Set<TrainerAcceptance> trainerAcceptance;

    private TrainerAcceptanceRepositoryImpl(){
        this.trainerAcceptance = new HashSet<>();
    }

    public static TrainerAcceptanceRepositoryImpl  getRepository(){
        if (repository==null) repository = new TrainerAcceptanceRepositoryImpl();
        return repository;
    }

    public TrainerAcceptance create(TrainerAcceptance trainerAcceptance){
        this.trainerAcceptance.add(trainerAcceptance);
        return trainerAcceptance;
    }
    public void delete(TrainerAcceptance trainerAcceptance){
        this.trainerAcceptance.remove(trainerAcceptance);
    }
    public TrainerAcceptance read(final String message){
        return findMessage(message);

    }

    private TrainerAcceptance findMessage(String message) {
        for(TrainerAcceptance c: this.trainerAcceptance){
            if(c.getMessage().equals(message)) return c;
        }
        return null;
    }

    public TrainerAcceptance update(TrainerAcceptance trainerAcceptance){
        TrainerAcceptance c = findMessage(trainerAcceptance.getMessage());
        if(c != null){
            TrainerAcceptance a = new TrainerAcceptance.Builder().Copy(trainerAcceptance).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String message) {

    }

    public Set<TrainerAcceptance>getAll(){
        return this.trainerAcceptance;
    }
}
