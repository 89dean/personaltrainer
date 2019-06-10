package com.dean.repository.impl;

import com.dean.domain.CoachLogin;
import com.dean.factory.CoachLoginFactory;
import com.dean.factory.CustomerLoginFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CoachLoginRepositoryImplTest {

    private CoachLoginRepository repository;
    private String emailAddress = " ";

    @Test
    public void create() throws IOException {
        CoachLogin coachLogin = CoachLoginFactory.getCoachlogin("dean.febuary3@gmail.com","people");
        CoachLogin coachLogin1 = repository.create(coachLogin);
        emailAddress = coachLogin1.getEmailAddress();
        Assert.assertNotNull(coachLogin);
    }

    @Test
    public void read() {
        CoachLogin coachLogin = repository.read(emailAddress);
        Assert.assertNotNull(coachLogin);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
    }
}