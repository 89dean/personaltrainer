package com.dean.repository.impl;

import com.dean.domain.GymMemberRegistration;
import com.dean.repository.GymMemberRegistrationRepository;

import java.util.*;

public class GymMemberRegistrationRepositoryImpl implements GymMemberRegistrationRepository {

    private static GymMemberRegistrationRepositoryImpl repository = null;
    private Set<GymMemberRegistration> gymMemberRegistration;

    private GymMemberRegistrationRepositoryImpl(){
        this.gymMemberRegistration = new HashSet<>();
    }
    private GymMemberRegistration findid(String id) {
        return this.gymMemberRegistration.stream()
                .filter(gymMemberRegistration -> gymMemberRegistration.getid().trim().equals(id))
                .findAny()
                .orElse(null);
    }

    public static GymMemberRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberRegistrationRepositoryImpl();
        return repository;
    }

    public GymMemberRegistration create(GymMemberRegistration gymMemberRegistration){
        this.gymMemberRegistration.add(gymMemberRegistration);
        return gymMemberRegistration;
    }
    public GymMemberRegistration read(String id){
        GymMemberRegistration gymMemberRegistration = findid(id);
        return gymMemberRegistration;
    }
    public GymMemberRegistration update(GymMemberRegistration gymMemberRegistration){
        GymMemberRegistration toDelete = findid(gymMemberRegistration.getEmailAddress());
        if(toDelete != null) {
            this.gymMemberRegistration.remove(toDelete);
            return create(gymMemberRegistration);
        }
        return null;
    }
    public void delete(String id){
        GymMemberRegistration gymMemberRegistration = findid(id);
        if (gymMemberRegistration != null) this.gymMemberRegistration.remove(id);
    }

    public Set<GymMemberRegistration>getAll(){
        return this.gymMemberRegistration;
    }
}
