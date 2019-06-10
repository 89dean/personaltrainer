package com.dean.repository.impl;

import com.dean.domain.GymMemberResetPassword;

import java.util.*;

public class GymMemberResetPasswordRepositoryImpl implements GymMemberResetPasswordRepository {

    private static GymMemberResetPasswordRepositoryImpl repository = null;
    private Map<String,GymMemberResetPassword> gymMemberResetPassword;

    private GymMemberResetPasswordRepositoryImpl(){

        this.gymMemberResetPassword = new HashMap<>();
    }

    public static GymMemberResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberResetPasswordRepositoryImpl();
        return repository;
    }

    public GymMemberResetPassword create(GymMemberResetPassword gymMemberResetPassword){
        this.gymMemberResetPassword.put(gymMemberResetPassword.getEmailAddress(),gymMemberResetPassword);
        return gymMemberResetPassword;
    }
    public GymMemberResetPassword read(String emailAddress){
        return this.gymMemberResetPassword.get(emailAddress);
    }
    public GymMemberResetPassword update(GymMemberResetPassword gymMemberResetPassword){
        this.gymMemberResetPassword.replace(gymMemberResetPassword.getEmailAddress(),gymMemberResetPassword);
        return this.gymMemberResetPassword.get(gymMemberResetPassword.getEmailAddress());
    }
    public void delete(String emailAddress){
        this.gymMemberResetPassword.remove(emailAddress);
    }

    public Set<GymMemberResetPassword>getAll(){
        Collection<GymMemberResetPassword> gymMemberResetPassword = this.gymMemberResetPassword.values();
        Set<GymMemberResetPassword> set = new HashSet<>();
        set.addAll(gymMemberResetPassword);
        return set;
    }
}
