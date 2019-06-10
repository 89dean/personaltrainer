package com.dean.repository.impl;

import com.dean.domain.GymMemberLogin;
import com.dean.domain.GymMemeberRegistration;

import java.util.*;

public class GymMemberRegistrationRepositoryImpl implements GymMemberRegistrationRepository {

    private static GymMemberRegistrationRepositoryImpl repository = null;
    private Map<String,GymMemeberRegistration> gymMemberRegistration;

    private GymMemberRegistrationRepositoryImpl(){
        this.gymMemberRegistration = new HashMap<>();
    }

    public static GymMemberRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberRegistrationRepositoryImpl();
        return repository;
    }

    public GymMemeberRegistration create(GymMemeberRegistration gymMemeberRegistration){
        this.gymMemberRegistration.put(gymMemeberRegistration.getid(),gymMemeberRegistration);
        return gymMemeberRegistration;
    }
    public GymMemeberRegistration read(String id){
        return this.gymMemberRegistration.get(id);
    }
    public GymMemeberRegistration update(GymMemeberRegistration gymMemeberRegistration){
        this.gymMemberRegistration.replace(gymMemeberRegistration.getid(),gymMemeberRegistration);
        return this.gymMemberRegistration.get(gymMemeberRegistration.getid());
    }
    public void delete(String id){
        this.gymMemberRegistration.remove(id);
    }

    public Set<GymMemeberRegistration>getAll(){
        Collection<GymMemeberRegistration> gymMemeberRegistration = this.gymMemberRegistration.values();
        Set<GymMemeberRegistration> set = new HashSet<>();
        set.addAll(gymMemeberRegistration);
        return set;
    }
}
