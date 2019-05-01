package com.dean.repository.impl;

import com.dean.domain.CoachRegistration;
import com.dean.domain.CoachResetPassword;

import java.util.HashSet;
import java.util.Set;

public class CoachResetPasswordRepositoryImpl implements CoachResetPasswordRepository {

    private static CoachResetPasswordRepositoryImpl repository = null;
    private Set<CoachResetPassword> coachResetPassword;

    private CoachResetPasswordRepositoryImpl(){
        this.coachResetPassword = new HashSet<>();
    }

    public static CoachResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachResetPasswordRepositoryImpl();
        return repository;
    }

    public CoachResetPassword create(CoachResetPassword coachResetPassword){
        this.coachResetPassword.add(coachResetPassword);
        return coachResetPassword;
    }
    public void delete(CoachResetPassword coachResetPassword){
        this.coachResetPassword.remove(coachResetPassword);
    }
    public CoachResetPassword read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private CoachResetPassword findMessage(String coachResetPassword) {
        for(CoachResetPassword c: this.coachResetPassword){
            if(c.getEmailAddress().equals(coachResetPassword)) return c;
        }
        return null;
    }

    public CoachResetPassword update(CoachResetPassword coachResetPassword){
        CoachResetPassword c = findMessage(coachResetPassword.getEmailAddress());
        if(c != null){
            CoachResetPassword a = new CoachResetPassword.Builder().Copy(coachResetPassword).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<CoachResetPassword>getAll(){
        return this.coachResetPassword;
    }
}
