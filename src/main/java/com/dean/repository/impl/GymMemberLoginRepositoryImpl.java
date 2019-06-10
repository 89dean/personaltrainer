package com.dean.repository.impl;

import com.dean.domain.GymMemberLogin;

import java.util.*;

public class GymMemberLoginRepositoryImpl implements GymMemberLoginRepository {

    private static GymMemberLoginRepositoryImpl repository = null;
    private Map<String,GymMemberLogin> gymMemberLogin;

    private GymMemberLoginRepositoryImpl(){

        this.gymMemberLogin = new HashMap<>();
    }

    public static GymMemberLoginRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberLoginRepositoryImpl();
        return repository;
    }

    public GymMemberLogin create(GymMemberLogin gymMemberLogin){
        this.gymMemberLogin.put(gymMemberLogin.getEmailAddress(),gymMemberLogin);
        return gymMemberLogin;
    }
    public GymMemberLogin read(String emailAddress){
        return this.gymMemberLogin.get(emailAddress);
    }

    public GymMemberLogin update(GymMemberLogin gymMemberLogin){
        this.gymMemberLogin.replace(gymMemberLogin.getEmailAddress(),gymMemberLogin);
        return this.gymMemberLogin.get(gymMemberLogin.getEmailAddress());
    }
    public void delete(String emailAddress){

        this.gymMemberLogin.remove(emailAddress);
    }

    public Set<GymMemberLogin>getAll(){
        Collection<GymMemberLogin> gymMemberLogin = this.gymMemberLogin.values();
        Set<GymMemberLogin> set = new HashSet<>();
        set.addAll(gymMemberLogin);
        return set;
    }
}
