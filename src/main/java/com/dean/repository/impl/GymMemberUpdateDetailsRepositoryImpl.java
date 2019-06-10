package com.dean.repository.impl;

import com.dean.domain.GymMemberUpdateDetails;

import java.util.*;

public class GymMemberUpdateDetailsRepositoryImpl implements GymMemberUpdateDetailsRepository {

    private static GymMemberUpdateDetailsRepositoryImpl repository = null;
    private Map<String,GymMemberUpdateDetails> gymMemberUpdateDetails;

    private GymMemberUpdateDetailsRepositoryImpl(){

        this.gymMemberUpdateDetails = new HashMap<>();
    }

    public static GymMemberUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberUpdateDetailsRepositoryImpl();
        return repository;
    }

    public GymMemberUpdateDetails create(GymMemberUpdateDetails gymMemberUpdateDetails){
        this.gymMemberUpdateDetails.put(gymMemberUpdateDetails.getName(),gymMemberUpdateDetails);
        return gymMemberUpdateDetails;
    }
    public GymMemberUpdateDetails read(String name){
        return this.gymMemberUpdateDetails.get(name);
    }
    public GymMemberUpdateDetails update(GymMemberUpdateDetails gymMemberUpdateDetails){
        this.gymMemberUpdateDetails.replace(gymMemberUpdateDetails.getName(),gymMemberUpdateDetails);
        return this.gymMemberUpdateDetails.get(gymMemberUpdateDetails.getName());
    }
    public void delete(String name){
        this.gymMemberUpdateDetails.remove(name);
    }

    public Set<GymMemberUpdateDetails>getAll(){
        Collection<GymMemberUpdateDetails> gymMemberUpdateDetails = this.gymMemberUpdateDetails.values();
        Set<GymMemberUpdateDetails> set = new HashSet<>();
        set.addAll(gymMemberUpdateDetails);
        return set;
    }
}
