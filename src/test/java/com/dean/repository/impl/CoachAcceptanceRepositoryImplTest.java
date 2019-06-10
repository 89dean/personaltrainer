package com.dean.repository.impl;

import com.dean.domain.CoachAcceptance;
import com.dean.factory.CoachAcceptanceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CoachAcceptanceRepositoryImplTest {
    private CoachAcceptanceRepository repository;
    private String message = null;

    @Test
    public void create() throws IOException {
        CoachAcceptance coachAcceptance = CoachAcceptanceFactory.getCoachAcceptance("dean","february","I accept");
        CoachAcceptance coachAcceptance1 = repository.create(coachAcceptance);
        message = coachAcceptance1.getMessage();
        Assert.assertNotNull(coachAcceptance);

    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}