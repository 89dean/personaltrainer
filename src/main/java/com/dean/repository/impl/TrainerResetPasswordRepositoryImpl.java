package com.dean.repository.impl;

import com.dean.domain.TrainerResetPassword;

import java.util.*;

public class TrainerResetPasswordRepositoryImpl implements TrainerResetPasswordRepository {

    private static TrainerResetPasswordRepositoryImpl repository = null;
    private Map<String,TrainerResetPassword> trainerResetPassword;

    private TrainerResetPasswordRepositoryImpl(){

        this.trainerResetPassword = new HashMap<>();
    }

    public static TrainerResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerResetPasswordRepositoryImpl();
        return repository;
    }

    public TrainerResetPassword create(TrainerResetPassword trainerResetPassword){
        this.trainerResetPassword.put(trainerResetPassword.getEmailAddress(),trainerResetPassword);
        return trainerResetPassword;
    }
    public TrainerResetPassword read(String emailAddress){
        return this.trainerResetPassword.get(emailAddress);
    }
    public TrainerResetPassword update(TrainerResetPassword trainerResetPassword){
        this.trainerResetPassword.replace(trainerResetPassword.getEmailAddress(),trainerResetPassword);
        return this.trainerResetPassword.get(trainerResetPassword.getEmailAddress());
    }
    public void delete(String emailAddress){
        this.trainerResetPassword.remove(emailAddress);
    }

    public Set<TrainerResetPassword>getAll(){
        Collection<TrainerResetPassword> trainerResetPassword = this.trainerResetPassword.values();
        Set<TrainerResetPassword> set = new HashSet<>();
        set.addAll(trainerResetPassword);
        return set;
    }
}

