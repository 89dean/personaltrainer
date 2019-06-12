package com.dean.repository.impl;

import com.dean.domain.GymMemberUpdateDetails;
import com.dean.repository.GymMemberUpdateDetailsRepository;

import java.util.*;

public class GymMemberUpdateDetailsRepositoryImpl implements GymMemberUpdateDetailsRepository {

    private static GymMemberUpdateDetailsRepositoryImpl repository = null;
    private Set<GymMemberUpdateDetails> gymMemberUpdateDetails;

    private GymMemberUpdateDetailsRepositoryImpl(){

        this.gymMemberUpdateDetails = new HashSet<>();
    }
    private GymMemberUpdateDetails finadname(String name) {
        return this.gymMemberUpdateDetails.stream()
                .filter(gymMemberUpdateDetails -> gymMemberUpdateDetails.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static GymMemberUpdateDetailsRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberUpdateDetailsRepositoryImpl();
        return repository;
    }

    public GymMemberUpdateDetails create(GymMemberUpdateDetails gymMemberUpdateDetails){
        this.gymMemberUpdateDetails.add(gymMemberUpdateDetails);
        return gymMemberUpdateDetails;
    }
    public GymMemberUpdateDetails read(String name){
        GymMemberUpdateDetails gymMemberUpdateDetails = finadname(name);
        return gymMemberUpdateDetails;
    }
    public GymMemberUpdateDetails update(GymMemberUpdateDetails gymMemberUpdateDetails){
        GymMemberUpdateDetails toDelete = finadname(gymMemberUpdateDetails.getName());
        if(toDelete != null) {
            this.gymMemberUpdateDetails.remove(toDelete);
            return create(gymMemberUpdateDetails);
        }
        return null;

    }
    public void delete(String name){
        GymMemberUpdateDetails gymMemberUpdateDetails = finadname(name);
        if (gymMemberUpdateDetails != null) this.gymMemberUpdateDetails.remove(name);
    }

    public Set<GymMemberUpdateDetails>getAll(){
        return this.gymMemberUpdateDetails;
    }
}
