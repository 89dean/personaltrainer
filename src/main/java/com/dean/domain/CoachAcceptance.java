package com.dean.domain;

import org.hibernate.annotations.RowId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coach Acceptance")
public class CoachAcceptance {
    @Id
    private String acceptanceId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Messgae")
    private String message;

    private CoachAcceptance() {
    }

    private CoachAcceptance(Builder builder) {
        this.acceptanceId = builder.acceptanceId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.message = builder.message;
    }

    public String getId() {
        return acceptanceId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder {

        private String name, surname, message, acceptanceId;

        public Builder id(String acceptanceId) {
            this.acceptanceId = acceptanceId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder Copy(CoachAcceptance coachAcceptance) {
            this.acceptanceId = coachAcceptance.acceptanceId;
            this.name = coachAcceptance.name;
            this.surname = coachAcceptance.surname;
            this.message = coachAcceptance.message;


            return this;
        }

        public CoachAcceptance build() {
            return new CoachAcceptance(this);
        }
    }

    @Override
    public String toString() {
        return "CoachAcceptance{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", message='" + message + '\'' +
                ", acceptanceId='" + acceptanceId + '\'' +
                '}';
    }
}

