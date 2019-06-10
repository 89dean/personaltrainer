package com.dean.repository.impl;

import com.dean.domain.TrainerLogin;

import java.util.*;

public class TrainerLoginRepositoryImpl implements TrainerLoginRepository {

    private static TrainerLoginRepositoryImpl repository = null;
    private Map<String,TrainerLogin> trainerLogin;

    private TrainerLoginRepositoryImpl(){

        this.trainerLogin = new HashMap<>();
    }

    public static TrainerLoginRepository  getRepository(){
        if (repository==null)repository = new TrainerLoginRepositoryImpl();
        return repository;
    }

    public TrainerLogin create(TrainerLogin trainerLogin){
        this.trainerLogin.put(trainerLogin.getEmailAddress(),trainerLogin);
        return trainerLogin;
    }
    public TrainerLogin read(String emailAddress){
        return this.trainerLogin.get(emailAddress);
    }
    public TrainerLogin update(TrainerLogin trainerLogin){
        this.trainerLogin.replace(trainerLogin.getEmailAddress(),trainerLogin);
        return this.trainerLogin.get(trainerLogin.getEmailAddress());
    }
    public void delete(String emailAddress){
        this.trainerLogin.remove(emailAddress);
    }

    public Set<TrainerLogin>getAll(){
        Collection<TrainerLogin> trainerLogin = this.trainerLogin.values();
        Set<TrainerLogin> set = new HashSet<>();
        set.addAll(trainerLogin);
        return set;
    }
}
