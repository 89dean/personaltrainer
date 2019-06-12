package com.dean.repository.impl;

import com.dean.domain.CoachResetPassword;
import com.dean.repository.CoachResetPasswordRepository;

import java.util.*;

public class CoachResetPasswordRepositoryImpl implements CoachResetPasswordRepository {

    private static CoachResetPasswordRepositoryImpl repository = null;
    private Set<CoachResetPassword> coachResetPassword;

    private CoachResetPasswordRepositoryImpl(){

        this.coachResetPassword = new HashSet<>();
    }
    private CoachResetPassword findEmailAddress(String emailAddress) {
        return this.coachResetPassword.stream()
                .filter(coachResetPassword -> coachResetPassword.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }

    public static CoachResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new CoachResetPasswordRepositoryImpl();
        return repository;
    }

    public CoachResetPassword create(CoachResetPassword coachResetPassword){
        this.coachResetPassword.add(coachResetPassword);
        return coachResetPassword;
    }
    public CoachResetPassword read(String emailAddress){
        CoachResetPassword coachResetPassword = findEmailAddress(emailAddress);
        return coachResetPassword;
    }
    public CoachResetPassword update(CoachResetPassword coachResetPassword){
        CoachResetPassword toDelete = findEmailAddress(coachResetPassword.getEmailAddress());
        if(toDelete != null) {
            this.coachResetPassword.remove(toDelete);
            return create(coachResetPassword);
        }
        return null;
    }
    public void delete(String emailAddress){
        CoachResetPassword coachResetPassword = findEmailAddress(emailAddress);
        if (coachResetPassword != null) this.coachResetPassword.remove(emailAddress);
    }

    public Set<CoachResetPassword>getAll(){
        return this.coachResetPassword;
    }
}
