package com.dean.domain;

import java.util.Objects;

public class GymMemeberRegistration implements Comparable<GymMemeberRegistration> {
    private String name,surname,emailAddress,preferdSport,id;

    private GymMemeberRegistration(){}

    private GymMemeberRegistration(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.emailAddress = builder.emailAddress;
        this.preferdSport = builder.preferedSport;
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

    public String getPreferdSport() {
        return preferdSport;
    }

    public String getid(){return id;}

    @Override
    public int compareTo(GymMemeberRegistration o) {

        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String name,surname,emailAddress,preferedSport,id;

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
        public Builder preferedSport(String preferedSport){
            this.preferedSport = preferedSport;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder Copy(GymMemeberRegistration gymMemeberRegistration){
            this.name = gymMemeberRegistration.name;
            this.surname = gymMemeberRegistration.surname;
            this.emailAddress = gymMemeberRegistration.emailAddress;
            this.preferedSport = gymMemeberRegistration.preferdSport;
            this.id = gymMemeberRegistration.id;

            return this;
        }
        public GymMemeberRegistration build(){

            return new GymMemeberRegistration(this);
        }
    }

    @Override
    public String toString() {
        return "GymMemeberRegistration{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", preferdSport='" + preferdSport + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymMemeberRegistration that = (GymMemeberRegistration) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
