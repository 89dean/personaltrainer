package com.dean.repository.impl;

import com.dean.domain.GymMemberCancelation;

import java.util.*;

public class GymMemberCancelationRepositoryImpl implements GymMemberCancelationRepository {

    private static GymMemberCancelationRepositoryImpl repository = null;
    private Map<String,GymMemberCancelation> gymMemberCancelation;

    private GymMemberCancelationRepositoryImpl(){

        this.gymMemberCancelation = new HashMap<>();
    }

    public static GymMemberCancelationRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberCancelationRepositoryImpl();
        return repository;
    }

    public GymMemberCancelation create(GymMemberCancelation gymMemberCancelation){
        this.gymMemberCancelation.put(gymMemberCancelation.getCancelMessage(),gymMemberCancelation);
        return gymMemberCancelation;
    }
    public GymMemberCancelation read(String message){
        return this.gymMemberCancelation.get(message);
    }
    public GymMemberCancelation update(GymMemberCancelation gymMemberCancelation){
        this.gymMemberCancelation.replace(gymMemberCancelation.getCancelMessage(),gymMemberCancelation);
        return this.gymMemberCancelation.get(gymMemberCancelation.getCancelMessage());
    }
    public void delete(String message){
        this.gymMemberCancelation.remove(message);
    }

    public Set<GymMemberCancelation>getAll(){
        Collection<GymMemberCancelation> gymMemberCancelation = this.gymMemberCancelation.values();
        Set<GymMemberCancelation> set = new HashSet<>();
        set.addAll(gymMemberCancelation);
        return set;
    }


}
