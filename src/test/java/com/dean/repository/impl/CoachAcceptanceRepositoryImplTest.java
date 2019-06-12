package com.dean.repository.impl;

import com.dean.domain.CoachAcceptance;
import com.dean.factory.CoachAcceptanceFactory;
import com.dean.repository.CoachAcceptanceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class CoachAcceptanceRepositoryImplTest {
    private CoachAcceptanceRepository repository;
    private CoachAcceptance coachAcceptance;

    private CoachAcceptance getCoach() {
        Set<CoachAcceptance> coachAcceptanceSet = this.repository.getAll();
        return coachAcceptanceSet.iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.repository = CoachAcceptanceRepositoryImpl.getRepository();
        this.coachAcceptance = CoachAcceptanceFactory.getCoachAcceptance("dean","february","I accept");
    }

    @Test
    public void create() {
        CoachAcceptance coachAcceptance = this.repository.create(this.coachAcceptance);
        System.out.println("In create, created = " + coachAcceptance);
        getAll();
        Assert.assertSame(coachAcceptance, this.coachAcceptance);

    }

    @Test
    public void read() {
        CoachAcceptance coachAcceptance = getCoach();
        System.out.println("In read, addressId = "+ coachAcceptance.getMessage());
        CoachAcceptance read = this.repository.read(coachAcceptance.getMessage());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(coachAcceptance, read);
    }

    @Test
    public void update() {
        String newname = "New Test Address Name";
        CoachAcceptance coachAcceptance = new CoachAcceptance.Builder().Copy(getCoach()).message(newname).build();
        System.out.println("In update, about_to_updated = " + newname);
        CoachAcceptance updated = this.repository.update(coachAcceptance);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getMessage());
        getAll();
    }

    @Test
    public void delete() {
        CoachAcceptance coachAcceptance = getCoach();
        this.repository.delete(coachAcceptance.getMessage());
        getAll();
    }
    @Test
    public void getAll() {
        Set<CoachAcceptance> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
////        Assert.assertSame(1, all.size());

    }
}