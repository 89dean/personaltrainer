package com.dean.repository.impl;

import com.dean.domain.TrainerLogin;
import com.dean.repository.TrainerLoginRepository;

import java.util.*;

public class TrainerLoginRepositoryImpl implements TrainerLoginRepository {

    private static TrainerLoginRepositoryImpl repository = null;
    private Set<TrainerLogin> trainerLogin;

    private TrainerLoginRepositoryImpl(){

        this.trainerLogin = new HashSet<>();
    }
    private TrainerLogin findEmailAddress(String emailAddress) {
        return this.trainerLogin.stream()
                .filter(trainerLogin -> trainerLogin.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }

    public static TrainerLoginRepository  getRepository(){
        if (repository==null)repository = new TrainerLoginRepositoryImpl();
        return repository;
    }

    public TrainerLogin create(TrainerLogin trainerLogin){
        this.trainerLogin.add(trainerLogin);
        return trainerLogin;
    }
    public TrainerLogin read(String emailAddress){
        TrainerLogin trainerLogin = findEmailAddress(emailAddress);
        return trainerLogin;
    }
    public TrainerLogin update(TrainerLogin trainerLogin){
        TrainerLogin toDelete = findEmailAddress(trainerLogin.getEmailAddress());
        if(toDelete != null) {
            this.trainerLogin.remove(toDelete);
            return create(trainerLogin);
        }
        return null;
    }
    public void delete(String emailAddress){
        TrainerLogin trainerLogin = findEmailAddress(emailAddress);
        if (trainerLogin != null) this.trainerLogin.remove(emailAddress);
    }

    public Set<TrainerLogin>getAll(){
        return this.trainerLogin;
    }
}
