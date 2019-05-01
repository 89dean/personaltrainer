package com.dean.repository.impl;

import com.dean.domain.GymMemberResetPassword;

import java.util.HashSet;
import java.util.Set;

public class GymMemberResetPasswordRepositoryImpl implements GymMemberResetPasswordRepository {

    private static GymMemberResetPasswordRepositoryImpl repository = null;
    private Set<GymMemberResetPassword> gymMemberResetPassword;

    private GymMemberResetPasswordRepositoryImpl(){

        this.gymMemberResetPassword = new HashSet<>();
    }

    public static GymMemberResetPasswordRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberResetPasswordRepositoryImpl();
        return repository;
    }

    public GymMemberResetPassword create(GymMemberResetPassword gymMemberResetPassword){
        this.gymMemberResetPassword.add(gymMemberResetPassword);
        return gymMemberResetPassword;
    }
    public void delete(GymMemberResetPassword gymMemberResetPassword){
        this.gymMemberResetPassword.remove(gymMemberResetPassword);
    }
    public GymMemberResetPassword read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private GymMemberResetPassword findMessage(String gymMemberResetPassword) {
        for(GymMemberResetPassword c: this.gymMemberResetPassword){
            if(c.getEmailAddress().equals(gymMemberResetPassword)) return c;
        }
        return null;
    }

    public GymMemberResetPassword update(GymMemberResetPassword gymMemberResetPassword){
        GymMemberResetPassword c = findMessage(gymMemberResetPassword.getEmailAddress());
        if(c != null){
            GymMemberResetPassword a = new GymMemberResetPassword.Builder().Copy(gymMemberResetPassword).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    public Set<GymMemberResetPassword>getAll(){

        return this.gymMemberResetPassword;
    }
}
