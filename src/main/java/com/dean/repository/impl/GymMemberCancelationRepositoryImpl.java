package com.dean.repository.impl;

import com.dean.domain.GymMemberCancelation;

import java.util.HashSet;
import java.util.Set;

public class GymMemberCancelationRepositoryImpl implements GymMemberCancelationRepository {

    private static GymMemberCancelationRepositoryImpl repository = null;
    private Set<GymMemberCancelation> gymMemberCancelation;

    private GymMemberCancelationRepositoryImpl(){

        this.gymMemberCancelation = new HashSet<>();
    }

    public static GymMemberCancelationRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberCancelationRepositoryImpl();
        return repository;
    }

    public GymMemberCancelation create(GymMemberCancelation gymMemberCancelation){
        this.gymMemberCancelation.add(gymMemberCancelation);
        return gymMemberCancelation;
    }
    public void delete(GymMemberCancelation gymMemberCancelation){
        this.gymMemberCancelation.remove(gymMemberCancelation);
    }
    public GymMemberCancelation read(final String name){
        return findMessage(name);

    }

    private GymMemberCancelation findMessage(String gymMemberCancelation) {
        for(GymMemberCancelation c: this.gymMemberCancelation){
            if(c.getName().equals(gymMemberCancelation)) return c;
        }
        return null;
    }

    public GymMemberCancelation update(GymMemberCancelation gymMemberCancelation){
        GymMemberCancelation c = findMessage(gymMemberCancelation.getName());
        if(c != null){
            GymMemberCancelation a = new GymMemberCancelation.Builder().Copy(gymMemberCancelation).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<GymMemberCancelation>getAll(){

        return this.gymMemberCancelation;
    }
}
