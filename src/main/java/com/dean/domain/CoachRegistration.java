package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Coach Registration")
public class CoachRegistration{
    @Id
    private String registrationId;
    @Column(name = "Name")
    private String name;
    @Column(name= "Surname")
    private String surname;
    @Column(name = "Email")
    private String emailAddress;

    private CoachRegistration(){}

    private CoachRegistration(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.emailAddress = builder.emailAddress;
        this.registrationId = builder.registrationId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getRegistrationId(){return registrationId;}


    public static class Builder{
        private String name,surname,emailAddress,registrationId;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder registrationId(String id){
            this.registrationId = id;
            return this;
        }
        public Builder Copy(CoachRegistration coachRegistration){
            this.registrationId = coachRegistration.registrationId;
            this.name = coachRegistration.name;
            this.surname = coachRegistration.surname;
            this.emailAddress = coachRegistration.emailAddress;

            return this;
        }
        public CoachRegistration build(){
            return new CoachRegistration(this);
        }
    }

    @Override
    public String toString() {
        return "CoachRegistration{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", id='" + registrationId + '\'' +
                '}';
    }
}
