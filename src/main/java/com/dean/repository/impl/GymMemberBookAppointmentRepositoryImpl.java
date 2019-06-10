package com.dean.repository.impl;

import com.dean.domain.GymMemberBookAppointment;

import java.util.*;

public class GymMemberBookAppointmentRepositoryImpl implements GymMemberBookAppointmentRepository {

    private static GymMemberBookAppointmentRepositoryImpl repository = null;
    private Map<String,GymMemberBookAppointment> gymMemberBookAppointment;

    private GymMemberBookAppointmentRepositoryImpl(){

        this.gymMemberBookAppointment = new HashMap<>();
    }

    public static GymMemberBookAppointmentRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberBookAppointmentRepositoryImpl();
        return repository;
    }

    public GymMemberBookAppointment create(GymMemberBookAppointment gymMemberBookAppointment){
        this.gymMemberBookAppointment.put(gymMemberBookAppointment.getName(),gymMemberBookAppointment);
        return gymMemberBookAppointment;
    }
    public GymMemberBookAppointment read(String name){
        return this.gymMemberBookAppointment.get(name);
    }
    public GymMemberBookAppointment update(GymMemberBookAppointment gymMemberBookAppointment){
        this.gymMemberBookAppointment.replace(gymMemberBookAppointment.getName(),gymMemberBookAppointment);
        return this.gymMemberBookAppointment.get(gymMemberBookAppointment.getName());
    }
    public void delete(String name){
        this.gymMemberBookAppointment.remove(name);
    }

    public Set<GymMemberBookAppointment>getAll(){
        Collection<GymMemberBookAppointment> gymMemberBookAppointments = this.gymMemberBookAppointment.values();
        Set<GymMemberBookAppointment> set = new HashSet<>();
        set.addAll(gymMemberBookAppointments);
        return set;
    }
}
