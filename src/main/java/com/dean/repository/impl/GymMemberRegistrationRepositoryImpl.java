package com.dean.repository.impl;

import com.dean.domain.GymMemberLogin;
import com.dean.domain.GymMemeberRegistration;

import java.util.HashSet;
import java.util.Set;

public class GymMemberRegistrationRepositoryImpl implements GymMemberRegistrationRepository {

    private static GymMemberRegistrationRepositoryImpl repository = null;
    private Set<GymMemeberRegistration> gymMemberRegistration;

    private GymMemberRegistrationRepositoryImpl(){
        this.gymMemberRegistration = new HashSet<>();
    }

    public static GymMemberRegistrationRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberRegistrationRepositoryImpl();
        return repository;
    }

    public GymMemeberRegistration create(GymMemeberRegistration gymMemeberRegistration){
        this.gymMemberRegistration.add(gymMemeberRegistration);
        return gymMemeberRegistration;
    }
    public void delete(GymMemeberRegistration gymMemberRegistration){
        this.gymMemberRegistration.remove(gymMemberRegistration);
    }
    public GymMemeberRegistration read(final String emailAddress){
        return findMessage(emailAddress);

    }

    private GymMemeberRegistration findMessage(String customerLogin) {
        for(GymMemeberRegistration c: this.gymMemberRegistration){
            if(c.getEmailAddress().equals(customerLogin)) return c;
        }
        return null;
    }

    public GymMemeberRegistration update(GymMemeberRegistration gymMemeberRegistration){
        GymMemeberRegistration c = findMessage(gymMemeberRegistration.getEmailAddress());
        if(c != null){
            GymMemeberRegistration a = new GymMemeberRegistration.Builder().Copy(gymMemeberRegistration).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String emailAddress) {

    }

    public Set<GymMemeberRegistration>getAll(){

        return this.gymMemberRegistration;
    }
}
