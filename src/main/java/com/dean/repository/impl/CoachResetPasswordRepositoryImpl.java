package com.dean.repository.impl;

import com.dean.domain.CoachRegistration;
import com.dean.domain.CoachResetPassword;

import java.util.*;

public class CoachResetPasswordRepositoryImpl implements CoachResetPasswordRepository {

    private static CoachResetPasswordRepositoryImpl repository = null;
    private Map<String,CoachResetPassword> coachResetPassword;

    private CoachResetPasswordRepositoryImpl(){

        this.coachResetPassword = new HashMap<>();
    }

    public static CoachResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachResetPasswordRepositoryImpl();
        return repository;
    }

    public CoachResetPassword create(CoachResetPassword coachResetPassword){
        this.coachResetPassword.put(coachResetPassword.getEmailAddress(),coachResetPassword);
        return coachResetPassword;
    }
    public CoachResetPassword read(String emailAddress){
        return this.coachResetPassword.get(emailAddress);
    }
    public CoachResetPassword update(CoachResetPassword coachResetPassword){
        this.coachResetPassword.replace(coachResetPassword.getEmailAddress(),coachResetPassword);
        return this.coachResetPassword.get(coachResetPassword.getEmailAddress());
    }
    public void delete(String emailAddress){
        this.coachResetPassword.remove(emailAddress);
    }

    public Set<CoachResetPassword>getAll(){
        Collection<CoachResetPassword> coachResetPassword = this.coachResetPassword.values();
        Set<CoachResetPassword> set = new HashSet<>();
        set.addAll(coachResetPassword);
        return set;
    }
}
