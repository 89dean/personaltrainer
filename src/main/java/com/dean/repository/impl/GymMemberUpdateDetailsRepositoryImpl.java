package com.dean.repository.impl;

import com.dean.domain.GymMemberUpdateDetails;

import java.util.HashSet;
import java.util.Set;

public class GymMemberUpdateDetailsRepositoryImpl implements GymMemberUpdateDetailsRepository {

    private static GymMemberUpdateDetailsRepositoryImpl repository = null;
    private Set<GymMemberUpdateDetails> gymMemberUpdateDetails;

    private GymMemberUpdateDetailsRepositoryImpl(){
        this.gymMemberUpdateDetails = new HashSet<>();
    }

    public static GymMemberUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberUpdateDetailsRepositoryImpl();
        return repository;
    }

    public GymMemberUpdateDetails create(GymMemberUpdateDetails gymMemberUpdateDetails){
        this.gymMemberUpdateDetails.add(gymMemberUpdateDetails);
        return gymMemberUpdateDetails;
    }
    public void delete(GymMemberUpdateDetails gymMemberUpdateDetails){
        this.gymMemberUpdateDetails.remove(gymMemberUpdateDetails);
    }
    public GymMemberUpdateDetails read(final String name){
        return findMessage(name);

    }

    private GymMemberUpdateDetails findMessage(String gymMemberUpdateDetails) {
        for(GymMemberUpdateDetails c: this.gymMemberUpdateDetails){
            if(c.getName().equals(gymMemberUpdateDetails)) return c;
        }
        return null;
    }

    public GymMemberUpdateDetails update(GymMemberUpdateDetails gymMemberUpdateDetails){
        GymMemberUpdateDetails c = findMessage(gymMemberUpdateDetails.getName());
        if(c != null){
            GymMemberUpdateDetails a = new GymMemberUpdateDetails.Builder().Copy(gymMemberUpdateDetails).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String name) {

    }

    public Set<GymMemberUpdateDetails>getAll(){
        return this.gymMemberUpdateDetails;
    }
}
