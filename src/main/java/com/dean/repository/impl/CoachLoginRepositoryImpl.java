package com.dean.repository.impl;

import com.dean.domain.CoachLogin;
import com.dean.repository.CoachLoginRepository;

import java.util.*;

public class CoachLoginRepositoryImpl implements CoachLoginRepository {

    private static CoachLoginRepositoryImpl repository = null;
     private Set<CoachLogin> coachLogin;


    private CoachLoginRepositoryImpl(){

        this.coachLogin = new HashSet<>();
    }
    private CoachLogin findEmailAddress(String emailaddress) {
        return this.coachLogin.stream()
                .filter(coachLogin -> coachLogin.getEmailAddress().trim().equals(emailaddress))
                .findAny()
                .orElse(null);
    }

    public static CoachLoginRepository  getRepository(){
        if (repository==null)repository = new CoachLoginRepositoryImpl();
        return repository;
    }

    public CoachLogin create(CoachLogin coachLogin){
        this.coachLogin.add(coachLogin);
        return coachLogin;
    }
    public CoachLogin read(final String emailAddress){
        CoachLogin coachLogin = findEmailAddress(emailAddress);
        return coachLogin;
    }

    public CoachLogin update(CoachLogin coachLogin){
        CoachLogin toDelete = findEmailAddress(coachLogin.getEmailAddress());
        if(toDelete != null) {
            this.coachLogin.remove(toDelete);
            return create(coachLogin);
        }
        return null;
    }
    public void delete(String emailAddress){

        CoachLogin coachAcceptance = findEmailAddress(emailAddress);
        if (coachAcceptance != null) this.coachLogin.remove(emailAddress);
    }

    public Set<CoachLogin>getAll(){
        return this.coachLogin;
    }
}
