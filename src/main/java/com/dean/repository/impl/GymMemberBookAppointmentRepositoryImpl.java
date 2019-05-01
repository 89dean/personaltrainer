package com.dean.repository.impl;

import com.dean.domain.GymMemberBookAppointment;

import java.util.HashSet;
import java.util.Set;

public class GymMemberBookAppointmentRepositoryImpl implements GymMemberBookAppointmentRepository {

    private static GymMemberBookAppointmentRepositoryImpl repository = null;
    private Set<GymMemberBookAppointment> gymMemberBookAppointment;

    private GymMemberBookAppointmentRepositoryImpl(){
        this.gymMemberBookAppointment = new HashSet<>();
    }

    public static GymMemberBookAppointmentRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberBookAppointmentRepositoryImpl();
        return repository;
    }

    public GymMemberBookAppointment create(GymMemberBookAppointment gymMemberBookAppointment){
        this.gymMemberBookAppointment.add(gymMemberBookAppointment);
        return gymMemberBookAppointment;
    }
    public void delete(GymMemberBookAppointment gymMemberBookAppointment){
        this.gymMemberBookAppointment.remove(gymMemberBookAppointment);
    }
    public GymMemberBookAppointment read(final String name){
        return findMessage(name);

    }

    private GymMemberBookAppointment findMessage(String gymMemberBookAppointment) {
        for(GymMemberBookAppointment c: this.gymMemberBookAppointment){
            if(c.getName().equals(gymMemberBookAppointment)) return c;
        }
        return null;
    }

    public GymMemberBookAppointment update(GymMemberBookAppointment gymMemberBookAppointment){
        GymMemberBookAppointment c = findMessage(gymMemberBookAppointment.getName());
        if(c != null){
            GymMemberBookAppointment a = new GymMemberBookAppointment.Builder().Copy(gymMemberBookAppointment).build();
            return create(a);
        }
        return null;
    }

    @Override
    public void delete(String name) {

    }

    public Set<GymMemberBookAppointment>getAll(){
        return this.gymMemberBookAppointment;
    }
}
