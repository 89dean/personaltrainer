package com.dean.repository.impl;

import com.dean.domain.CoachAcceptance;
import com.dean.repository.CoachAcceptanceRepository;

import java.util.*;

public class CoachAcceptanceRepositoryImpl implements CoachAcceptanceRepository {

    private static CoachAcceptanceRepositoryImpl repository = null;
    private Set<CoachAcceptance> coachAcceptance;

    private CoachAcceptanceRepositoryImpl(){

        this.coachAcceptance = new HashSet<>();
    }
    private CoachAcceptance findMessage(String message) {
        return this.coachAcceptance.stream()
                .filter(coachAcceptance -> coachAcceptance.getMessage().trim().equals(message))
                .findAny()
                .orElse(null);
    }

    public static CoachAcceptanceRepository  getRepository(){
        if (repository==null) repository = new CoachAcceptanceRepositoryImpl();
        return repository;
    }

    public CoachAcceptance create(CoachAcceptance coachAcceptance){
        this.coachAcceptance.add(coachAcceptance);
            return coachAcceptance;
    }
    public CoachAcceptance read(final String message){
        CoachAcceptance coachAcceptance = findMessage(message);
        return coachAcceptance;
    }
    public CoachAcceptance update(CoachAcceptance coachAcceptance){
        CoachAcceptance toDelete = findMessage(coachAcceptance.getMessage());
        if(toDelete != null) {
            this.coachAcceptance.remove(toDelete);
            return create(coachAcceptance);
        }
        return null;

    }
    public void delete(String message){
        CoachAcceptance coachAcceptance = findMessage(message);
        if (coachAcceptance != null) this.coachAcceptance.remove(message);
    }

    public Set<CoachAcceptance>getAll(){
        return this.coachAcceptance;
    }

}
