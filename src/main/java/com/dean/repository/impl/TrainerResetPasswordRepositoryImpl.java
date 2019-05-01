package com.dean.repository.impl;

import com.dean.domain.TrainerResetPassword;

import java.util.HashSet;
import java.util.Set;

public class TrainerResetPasswordRepositoryImpl implements TrainerResetPasswordRepository {

    private static TrainerResetPasswordRepositoryImpl repository = null;
    private Set<TrainerResetPassword> trainerResetPassword;

    private TrainerResetPasswordRepositoryImpl(){
        this.trainerResetPassword = new HashSet<>();
    }

    public static TrainerResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new TrainerResetPasswordRepositoryImpl();
        return repository;
    }

    public TrainerResetPassword create(TrainerResetPassword trainerResetPassword){
        this.trainerResetPassword.add(trainerResetPassword);
        return trainerResetPassword;
    }
    public void delete(TrainerResetPassword trainerResetPassword){
        this.trainerResetPassword.remove(trainerResetPassword);
    }
    public TrainerResetPassword read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private TrainerResetPassword findMessage(String trainerResetPassword) {
        for(TrainerResetPassword c: this.trainerResetPassword){
            if(c.getEmailAddress().equals(trainerResetPassword)) return c;
        }
        return null;
    }

    public TrainerResetPassword update(TrainerResetPassword trainerResetPassword){
        TrainerResetPassword c = findMessage(trainerResetPassword.getEmailAddress());
        if(c != null){
            TrainerResetPassword a = new TrainerResetPassword.Builder().Copy(trainerResetPassword).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<TrainerResetPassword>getAll(){
        return this.trainerResetPassword;
    }
}

