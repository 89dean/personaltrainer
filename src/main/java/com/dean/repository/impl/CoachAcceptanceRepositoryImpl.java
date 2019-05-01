package com.dean.repository.impl;

import com.dean.domain.CoachAcceptance;

import java.util.HashSet;
import java.util.Set;

public class CoachAcceptanceRepositoryImpl implements CoachAcceptanceRepository{

    private static CoachAcceptanceRepositoryImpl repository = null;
    private Set<CoachAcceptance> coachAcceptance;

    private CoachAcceptanceRepositoryImpl(){
        this.coachAcceptance = new HashSet<>();
    }

    public static CoachAcceptanceRepository  getRepository(){
        if (repository==null) repository = new CoachAcceptanceRepositoryImpl();
        return repository;
    }

    public CoachAcceptance create(CoachAcceptance coachAcceptance){
        this.coachAcceptance.add(coachAcceptance);
        return coachAcceptance;
    }
    public void delete(CoachAcceptance coachAcceptance){
        this.coachAcceptance.remove(coachAcceptance);
    }
    public CoachAcceptance read(final String message){
        return findMessage(message);

    }

    private CoachAcceptance findMessage(String message) {
        for(CoachAcceptance c: this.coachAcceptance){
            if(c.getMessage().equals(message)) return c;
        }
        return null;
    }

    public CoachAcceptance update(CoachAcceptance coachAcceptance){
        CoachAcceptance c = findMessage(coachAcceptance.getMessage());
        if(c != null){
            CoachAcceptance a = new CoachAcceptance.Builder().Copy(coachAcceptance).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String message) {

    }

    public Set<CoachAcceptance>getAll(){
        return this.coachAcceptance;
    }

}
