package com.dean.repository.impl;

import com.dean.domain.GymMemberCancelation;
import com.dean.repository.GymMemberCancelationRepository;

import java.util.*;

public class GymMemberCancelationRepositoryImpl implements GymMemberCancelationRepository {

    private static GymMemberCancelationRepositoryImpl repository = null;
    private Set<GymMemberCancelation> gymMemberCancelation;

    private GymMemberCancelationRepositoryImpl(){

        this.gymMemberCancelation = new HashSet<>();
    }
    private GymMemberCancelation findcancelmessage(String cancelmesssage) {
        return this.gymMemberCancelation.stream()
                .filter(gymMemberCancelation -> gymMemberCancelation.getCancelMessage().trim().equals(cancelmesssage))
                .findAny()
                .orElse(null);
    }

    public static GymMemberCancelationRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberCancelationRepositoryImpl();
        return repository;
    }

    public GymMemberCancelation create(GymMemberCancelation gymMemberCancelation){
        this.gymMemberCancelation.add(gymMemberCancelation);
        return gymMemberCancelation;
    }
    public GymMemberCancelation read(String message){
        GymMemberCancelation gymMemberCancelation = findcancelmessage(message);
        return gymMemberCancelation;
    }
    public GymMemberCancelation update(GymMemberCancelation gymMemberCancelation){
        GymMemberCancelation toDelete = findcancelmessage(gymMemberCancelation.getCancelMessage());
        if(toDelete != null) {
            this.gymMemberCancelation.remove(toDelete);
            return create(gymMemberCancelation);
        }
        return null;
    }
    public void delete(String message){
        GymMemberCancelation gymMemberCancelation = findcancelmessage(message);
        if (gymMemberCancelation != null) this.gymMemberCancelation.remove(message);
    }

    public Set<GymMemberCancelation>getAll(){
        return this.gymMemberCancelation;
    }


}
