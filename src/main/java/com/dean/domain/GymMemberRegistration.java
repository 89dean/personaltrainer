package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Member Registration")
public class GymMemberRegistration  {
    @Id
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Email")
    private String emailAddress;
    @Column(name ="Sport")
    private String preferdSport;

    private GymMemberRegistration(){}

    private GymMemberRegistration(Builder builder){
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
        public Builder Copy(GymMemberRegistration gymMemberRegistration){
            this.name = gymMemberRegistration.name;
            this.surname = gymMemberRegistration.surname;
            this.emailAddress = gymMemberRegistration.emailAddress;
            this.preferedSport = gymMemberRegistration.preferdSport;
            this.id = gymMemberRegistration.id;

            return this;
        }
        public GymMemberRegistration build(){

            return new GymMemberRegistration(this);
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
}
