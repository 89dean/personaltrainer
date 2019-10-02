//package com.dean.repository.impl;
//
//import com.dean.domain.CoachAcceptance;
//import com.dean.domain.CoachLogin;
//import com.dean.repository.CoachLoginRepository;
//
//import java.util.*;
//
//public class CoachLoginRepositoryImpl implements CoachLoginRepository {
//
//    private static CoachLoginRepository coachLoginRepository;
//    private Set<CoachLogin> loginDB;
//
//    private CoachLoginRepositoryImpl() {
//        this.loginDB = new HashSet<>();
//    }
//
//    public static CoachLoginRepository getCoachLoginRepository() {
//        if (coachLoginRepository == null) coachLoginRepository = new CoachLoginRepositoryImpl();
//        return coachLoginRepository;
//    }
//
//    @Override
//    public CoachLogin create(String s, CoachLogin coachLogin) {
//        this.loginDB.add(coachLogin);
//        return coachLogin;
//    }
//
//    @Override
//    public CoachLogin read(String s) {
//        return this.loginDB.stream().filter(coachLogin -> coachLogin.getLoginId().equalsIgnoreCase(s)).findAny().orElse(null);
//    }
//
//    @Override
//    public CoachLogin update(String s, CoachLogin coachLogin) {
//        CoachLogin g = read(coachLogin.getLoginId());
//        if (g != null) {
//            delete(g.getLoginId());
//            return create(s, coachLogin);
//        }
//        return null;
//    }
//
//    @Override
//    public CoachLogin delete(String s) {
//        CoachLogin coachLogin = read(s);
//        this.loginDB.remove(coachLogin);
//        return coachLogin;
//    }
//
//    @Override
//    public CoachLogin retrieveByDesc(String loginDesc) {
//        return this.loginDB.stream().filter(coachLogin -> coachLogin.getEmailAddress().equalsIgnoreCase(loginDesc)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set<CoachLogin> getAll() {
//        return this.loginDB;
//        }
//
//        }
