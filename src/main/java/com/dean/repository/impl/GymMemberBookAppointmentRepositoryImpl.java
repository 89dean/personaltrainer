package com.dean.repository.impl;

import com.dean.domain.GymMemberBookAppointment;
import com.dean.repository.GymMemberBookAppointmentRepository;

import java.util.*;

public class GymMemberBookAppointmentRepositoryImpl implements GymMemberBookAppointmentRepository {

    private static GymMemberBookAppointmentRepositoryImpl repository = null;
    private Set<GymMemberBookAppointment> gymMemberBookAppointment;

    private GymMemberBookAppointmentRepositoryImpl(){

        this.gymMemberBookAppointment = new HashSet<>();
    }
    private GymMemberBookAppointment findname(String name) {
        return this.gymMemberBookAppointment.stream()
                .filter(gymMemberBookAppointment -> gymMemberBookAppointment.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static GymMemberBookAppointmentRepositoryImpl  getRepository(){
        if (repository==null)repository = new GymMemberBookAppointmentRepositoryImpl();
        return repository;
    }

    public GymMemberBookAppointment create(GymMemberBookAppointment gymMemberBookAppointment){
        this.gymMemberBookAppointment.add(gymMemberBookAppointment);
        return gymMemberBookAppointment;
    }
    public GymMemberBookAppointment read(String name){
        GymMemberBookAppointment gymMemberBookAppointment = findname(name);
        return gymMemberBookAppointment;
    }
    public GymMemberBookAppointment update(GymMemberBookAppointment gymMemberBookAppointment){
        GymMemberBookAppointment toDelete = findname(gymMemberBookAppointment.getName());
        if(toDelete != null) {
            this.gymMemberBookAppointment.remove(toDelete);
            return create(gymMemberBookAppointment);
        }
        return null;
    }
    public void delete(String name){
        GymMemberBookAppointment gymMemberBookAppointment = findname(name);
        if (gymMemberBookAppointment != null) this.gymMemberBookAppointment.remove(name);
    }

    public Set<GymMemberBookAppointment>getAll(){
        return this.gymMemberBookAppointment;
    }
}
