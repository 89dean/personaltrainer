package com.dean.repository.impl;

import com.dean.domain.TrainerResetPassword;
import com.dean.repository.TrainerResetPasswordRepository;

import java.util.*;

public class TrainerResetPasswordRepositoryImpl implements TrainerResetPasswordRepository {

    private static TrainerResetPasswordRepositoryImpl repository = null;
    private Set<TrainerResetPassword> trainerResetPassword;

    private TrainerResetPasswordRepositoryImpl(){

        this.trainerResetPassword = new HashSet<>();
    }
    private TrainerResetPassword findEmailAddress(String emailAddress) {
        return this.trainerResetPassword.stream()
                .filter(trainerResetPassword -> trainerResetPassword.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }

    public static TrainerResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerResetPasswordRepositoryImpl();
        return repository;
    }

    public TrainerResetPassword create(TrainerResetPassword trainerResetPassword){
        this.trainerResetPassword.add(trainerResetPassword);
        return trainerResetPassword;
    }
    public TrainerResetPassword read(String emailAddress){
        TrainerResetPassword trainerResetPassword = findEmailAddress(emailAddress);
        return trainerResetPassword;
    }
    public TrainerResetPassword update(TrainerResetPassword trainerResetPassword){
        TrainerResetPassword toDelete = findEmailAddress(trainerResetPassword.getEmailAddress());
        if(toDelete != null) {
            this.trainerResetPassword.remove(toDelete);
            return create(trainerResetPassword);
        }
        return null;
    }
    public void delete(String emailAddress){
        TrainerResetPassword trainerResetPassword = findEmailAddress(emailAddress);
        if (trainerResetPassword != null) this.trainerResetPassword.remove(emailAddress);
    }

    public Set<TrainerResetPassword>getAll(){
        return this.trainerResetPassword;
    }
}

