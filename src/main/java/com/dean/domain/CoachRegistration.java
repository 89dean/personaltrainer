package com.dean.domain;

import java.util.Objects;

public class CoachRegistration implements Comparable<CoachRegistration>{
    private String name,surname,emailAddress,id;

    private CoachRegistration(){}

    private CoachRegistration(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.emailAddress = builder.emailAddress;
        this.id = builder.id;
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

    public String getId(){return id;}

    @Override
    public int compareTo(CoachRegistration o) {
        return this.id.compareTo(o.id);
    }


    public static class Builder{
        private String name,surname,emailAddress,id;

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
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder Copy(CoachRegistration coachRegistration){
            this.id = coachRegistration.id;
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
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoachRegistration that = (CoachRegistration) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
