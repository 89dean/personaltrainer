package com.dean.repository.impl;

import com.dean.domain.GymMemberResetPassword;
import com.dean.repository.GymMemberResetPasswordRepository;

import java.util.*;

public class GymMemberResetPasswordRepositoryImpl implements GymMemberResetPasswordRepository {

    private static GymMemberResetPasswordRepositoryImpl repository = null;
    private Set<GymMemberResetPassword> gymMemberResetPassword;

    private GymMemberResetPasswordRepositoryImpl(){

        this.gymMemberResetPassword = new HashSet<>();
    }
    private GymMemberResetPassword findEmailAddress(String emailAddress) {
        return this.gymMemberResetPassword.stream()
                .filter(gymMemberResetPassword -> gymMemberResetPassword.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }

    public static GymMemberResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberResetPasswordRepositoryImpl();
        return repository;
    }

    public GymMemberResetPassword create(GymMemberResetPassword gymMemberResetPassword){
        this.gymMemberResetPassword.add(gymMemberResetPassword);
        return gymMemberResetPassword;
    }
    public GymMemberResetPassword read(String emailAddress){
        GymMemberResetPassword gymMemberResetPassword = findEmailAddress(emailAddress);
        return gymMemberResetPassword;
    }
    public GymMemberResetPassword update(GymMemberResetPassword gymMemberResetPassword){
        GymMemberResetPassword toDelete = findEmailAddress(gymMemberResetPassword.getEmailAddress());
        if(toDelete != null) {
            this.gymMemberResetPassword.remove(toDelete);
            return create(gymMemberResetPassword);
        }
        return null;
    }
    public void delete(String emailAddress){
        GymMemberResetPassword coachResetPassword = findEmailAddress(emailAddress);
        if (coachResetPassword != null) this.gymMemberResetPassword.remove(emailAddress);
    }

    public Set<GymMemberResetPassword>getAll(){
        return this.gymMemberResetPassword;
    }
}
