package com.dean.domain;

import java.util.Objects;

public class TrainerRegistration implements Comparable<TrainerRegistration> {
    private String name,surname,emailAddress,id;

    private TrainerRegistration(){}

    private TrainerRegistration(Builder builder){
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
    public int compareTo(TrainerRegistration o) {
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
        public Builder Copy(TrainerRegistration trainerRegistration){
            this.id = trainerRegistration.id;
            this.name = trainerRegistration.name;
            this.surname = trainerRegistration.surname;
            this.emailAddress = trainerRegistration.emailAddress;

            return this;
        }
        public TrainerRegistration build(){
            return new TrainerRegistration(this);
        }
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerRegistration that = (TrainerRegistration) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
