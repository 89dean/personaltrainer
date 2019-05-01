package com.dean.repository.impl;

import com.dean.domain.TrainerLogin;

import java.util.HashSet;
import java.util.Set;

public class TrainerLoginRepositoryImpl implements TrainerLoginRepository {

    private static TrainerLoginRepositoryImpl repository = null;
    private Set<TrainerLogin> trainerLogin;

    private TrainerLoginRepositoryImpl(){
        this.trainerLogin = new HashSet<>();
    }

    public static TrainerLoginRepository  getRepository(){
        if (repository==null)repository = new TrainerLoginRepositoryImpl();
        return repository;
    }

    public TrainerLogin create(TrainerLogin trainerLogin){
        this.trainerLogin.add(trainerLogin);
        return trainerLogin;
    }
    public void delete(TrainerLogin trainerLogin){
        this.trainerLogin.remove(trainerLogin);
    }
    public TrainerLogin read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private TrainerLogin findMessage(String emailAddress) {
        for(TrainerLogin c: this.trainerLogin){
            if(c.getEmailAddress().equals(emailAddress)) return c;
        }
        return null;
    }

    public TrainerLogin update(TrainerLogin trainerLogin){
        TrainerLogin c = findMessage(trainerLogin.getEmailAddress());
        if(c != null){
            TrainerLogin a = new TrainerLogin.Builder().Copy(trainerLogin).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String message) {

    }

    public Set<TrainerLogin>getAll(){
        return this.trainerLogin;
    }
}
