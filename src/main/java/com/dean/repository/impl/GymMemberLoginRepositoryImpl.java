package com.dean.repository.impl;

import com.dean.domain.GymMemberLogin;
import com.dean.repository.GymMemberLoginRepository;

import java.util.*;

public class GymMemberLoginRepositoryImpl implements GymMemberLoginRepository {

    private static GymMemberLoginRepositoryImpl repository = null;
    private Set<GymMemberLogin> gymMemberLogin;

    private GymMemberLoginRepositoryImpl(){

        this.gymMemberLogin = new HashSet<>();
    }
    private GymMemberLogin findemail(String emailAddress) {
        return this.gymMemberLogin.stream()
                .filter(gymMemberLogin -> gymMemberLogin.getEmailAddress().trim().equals(emailAddress))
                .findAny()
                .orElse(null);
    }

    public static GymMemberLoginRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberLoginRepositoryImpl();
        return repository;
    }

    public GymMemberLogin create(GymMemberLogin gymMemberLogin){
        this.gymMemberLogin.add(gymMemberLogin);
        return gymMemberLogin;
    }
    public GymMemberLogin read(String emailAddress){
        GymMemberLogin gymMemberLogin = findemail(emailAddress);
        return gymMemberLogin;
    }

    public GymMemberLogin update(GymMemberLogin gymMemberLogin){
        GymMemberLogin toDelete = findemail(gymMemberLogin.getEmailAddress());
        if(toDelete != null) {
            this.gymMemberLogin.remove(toDelete);
            return create(gymMemberLogin);
        }
        return null;
    }
    public void delete(String emailAddress){
        GymMemberLogin gymMemberLogin = findemail(emailAddress);
        if (gymMemberLogin != null) this.gymMemberLogin.remove(emailAddress);
    }

    public Set<GymMemberLogin>getAll(){
        return this.gymMemberLogin;
    }
}
