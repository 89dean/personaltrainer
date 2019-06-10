package com.dean.repository.impl;

import com.dean.domain.CoachAcceptance;

import java.util.*;

public class CoachAcceptanceRepositoryImpl implements CoachAcceptanceRepository{

    private static CoachAcceptanceRepositoryImpl repository = null;
    private Map<String, CoachAcceptance> coachAcceptance;

    private CoachAcceptanceRepositoryImpl(){
        this.coachAcceptance = new HashMap<>();
    }

    public static CoachAcceptanceRepository  getRepository(){
        if (repository==null) repository = new CoachAcceptanceRepositoryImpl();
        return repository;
    }

    public CoachAcceptance create(CoachAcceptance coachAcceptance){
        this.coachAcceptance.put(coachAcceptance.getMessage(),coachAcceptance);
        return coachAcceptance;
    }
    public CoachAcceptance read(String message){
        return this.coachAcceptance.get(message);

    }
    public CoachAcceptance update(CoachAcceptance coachAcceptance){
        this.coachAcceptance.replace(coachAcceptance.getMessage(),coachAcceptance);
        return this.coachAcceptance.get(coachAcceptance.getMessage());

    }
    public void delete(String message){
        this.coachAcceptance.remove(message);
    }

    public Set<CoachAcceptance>getAll(){
        Collection<CoachAcceptance> coachAcceptance = this.coachAcceptance.values();
        Set<CoachAcceptance> set = new HashSet<>();
        set.addAll(coachAcceptance);
        return set;
    }

}
