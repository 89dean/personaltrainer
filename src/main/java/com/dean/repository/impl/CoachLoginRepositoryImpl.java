package com.dean.repository.impl;

import com.dean.domain.CoachLogin;

import java.util.*;

public class CoachLoginRepositoryImpl implements CoachLoginRepository {

    private static CoachLoginRepositoryImpl repository = null;
     private Map<String, CoachLogin> coachLogin;


    private CoachLoginRepositoryImpl(){

        this.coachLogin = new HashMap<>();
    }

    public static CoachLoginRepository  getRepository(){
        if (repository==null)repository = new CoachLoginRepositoryImpl();
        return repository;
    }

    public CoachLogin create(CoachLogin coachLogin){
        this.coachLogin.put(coachLogin.getEmailAddress(),coachLogin);
        return coachLogin;
    }
    public CoachLogin read(String emailAddress){

        return this.coachLogin.get(emailAddress);
    }

    public CoachLogin update(CoachLogin coachLogin){
        this.coachLogin.replace(coachLogin.getEmailAddress(),coachLogin);
        return this.coachLogin.get(coachLogin.getEmailAddress());
    }
    public void delete(String emailAddress){

        this.coachLogin.remove(emailAddress);
    }

    public Set<CoachLogin>getAll(){
        Collection<CoachLogin>coachLogin = this.coachLogin.values();
        Set<CoachLogin> set = new HashSet<>();
        set.addAll(coachLogin);
        return set;
    }
}
