package com.dean.repository.impl;

import com.dean.domain.GymMemberLogin;

import java.util.HashSet;
import java.util.Set;

public class GymMemberLoginRepositoryImpl implements GymMemberLoginRepository {

    private static GymMemberLoginRepositoryImpl repository = null;
    private Set<GymMemberLogin> gymMemberLogin;

    private GymMemberLoginRepositoryImpl(){
        this.gymMemberLogin = new HashSet<>();
    }

    public static GymMemberLoginRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberLoginRepositoryImpl();
        return repository;
    }

    public GymMemberLogin create(GymMemberLogin gymMemberLogin){
        this.gymMemberLogin.add(gymMemberLogin);
        return gymMemberLogin;
    }
    public void delete(GymMemberLogin gymMemberLogin){
        this.gymMemberLogin.remove(gymMemberLogin);
    }
    public GymMemberLogin read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private GymMemberLogin findMessage(String gymMemberLogin) {
        for(GymMemberLogin c: this.gymMemberLogin){
            if(c.getEmailAddress().equals(gymMemberLogin)) return c;
        }
        return null;
    }

    public GymMemberLogin update(GymMemberLogin gymMemberLogin){
        GymMemberLogin c = findMessage(gymMemberLogin.getEmailAddress());
        if(c != null){
            GymMemberLogin a = new GymMemberLogin.Builder().Copy(gymMemberLogin).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String emailAddress) {

    }

    public Set<GymMemberLogin>getAll(){

        return this.gymMemberLogin;
    }
}
