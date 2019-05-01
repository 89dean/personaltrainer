package com.dean.repository.impl;

import com.dean.domain.CoachLogin;

import java.util.HashSet;
import java.util.Set;

public class CoachLoginRepositoryImpl implements CoachLoginRepository {

    private static CoachLoginRepositoryImpl repository = null;
    private Set<CoachLogin> coachLogin;

    private CoachLoginRepositoryImpl(){
        this.coachLogin = new HashSet<>();
    }

    public static CoachLoginRepository  getRepository(){
        if (repository==null)repository = new CoachLoginRepositoryImpl();
        return repository;
    }

    public CoachLogin create(CoachLogin coachLogin){
        this.coachLogin.add(coachLogin);
        return coachLogin;
    }
    public void delete(CoachLogin coachLogin){
        this.coachLogin.remove(coachLogin);
    }
    public CoachLogin read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private CoachLogin findMessage(String emailAddress) {
        for(CoachLogin c: this.coachLogin){
            if(c.getEmailAddress().equals(emailAddress)) return c;
        }
        return null;
    }

    public CoachLogin update(CoachLogin coachLogin){
        CoachLogin c = findMessage(coachLogin.getEmailAddress());
        if(c != null){
            CoachLogin a = new CoachLogin.Builder().Copy(coachLogin).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String message) {

    }

    public Set<CoachLogin>getAll(){
        return this.coachLogin;
    }
}
