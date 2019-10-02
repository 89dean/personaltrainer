//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CoachRegistration;
//import com.dean.repository.CoachRegistrationRepository;
//
//import java.util.*;
//
//public class CoachRegistrationRepositoryImpl implements CoachRegistrationRepository {
//
//    private static CoachRegistrationRepositoryImpl CoachRegistrationRepositoryImpl;
//
//    private Set<CoachRegistration> loginDB;
//
//    private CoachRegistrationRepositoryImpl() {
//        this.loginDB = new HashSet<>();
//    }
//
//    public static CoachRegistrationRepositoryImpl getCoachRegistrationRepositoryImpl() {
//        if (CoachRegistrationRepositoryImpl == null) CoachRegistrationRepositoryImpl = new CoachRegistrationRepositoryImpl();
//        return CoachRegistrationRepositoryImpl;
//    }
//
//    @Override
//    public CoachRegistration create(String s, CoachRegistration CoachRegistration) {
//        this.loginDB.add(CoachRegistration);
//        return CoachRegistration;
//    }
//
//    @Override
//    public CoachRegistration read(String s) {
//        return this.loginDB.stream().filter(CoachRegistration -> CoachRegistration.getRegistrationId().equalsIgnoreCase(s)).findAny().orElse(null);
//    }
//
//    @Override
//    public CoachRegistration update(String s, CoachRegistration CoachRegistration) {
//        CoachRegistration g = read(CoachRegistration.getRegistrationId());
//        if (g != null) {
//            delete(g.getRegistrationId());
//            return create(s, CoachRegistration);
//        }
//        return null;
//    }
//
//    @Override
//    public CoachRegistration delete(String s) {
//        CoachRegistration CoachRegistration = read(s);
//        this.loginDB.remove(CoachRegistration);
//        return CoachRegistration;
//    }
//
//    @Override
//    public CoachRegistration retrieveByDesc(String loginDesc) {
//        return this.loginDB.stream().filter(coachRegistration -> coachRegistration.getRegistrationId().equalsIgnoreCase(loginDesc)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set<CoachRegistration> getAll() {
//        return this.loginDB;
//    }
//
//}
//
//
