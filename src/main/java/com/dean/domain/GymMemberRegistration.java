//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class GymMemberRegistration  {
//    @Id
//    private String id;
//    private String name;
//    private String surname;
//    private String emailAddress;
//    private String preferdSport;
//
//    private GymMemberRegistration(){}
//
//    private GymMemberRegistration(Builder builder){
//        this.name = builder.name;
//        this.surname = builder.surname;
//        this.emailAddress = builder.emailAddress;
//        this.preferdSport = builder.preferdSport;
//        this.id = builder.id;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public String getPreferdSport() {
//        return preferdSport;
//    }
//
//    public String getid(){return id;}
//
//
//    public static class Builder{
//        private String id;
//        private String name;
//        private String surname;
//        private String emailAddress;
//        private String preferdSport;
//
//
//        public Builder name(String name){
//            this.name = name;
//            return this;
//        }
//        public Builder surname(String surname){
//            this.surname = surname;
//            return this;
//        }
//        public Builder emailAddress(String emailAddress){
//            this.emailAddress = emailAddress;
//            return this;
//        }
//        public Builder preferedSport(String preferedSport){
//            this.preferdSport = preferedSport;
//            return this;
//        }
//        public Builder id(String id){
//            this.id = id;
//            return this;
//        }
//        public Builder Copy(GymMemberRegistration gymMemberRegistration){
//            this.name = gymMemberRegistration.name;
//            this.surname = gymMemberRegistration.surname;
//            this.emailAddress = gymMemberRegistration.emailAddress;
//            this.preferdSport = gymMemberRegistration.preferdSport;
//            this.id = gymMemberRegistration.id;
//
//            return this;
//        }
//        public GymMemberRegistration build(){
//
//            return new GymMemberRegistration(this);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "GymMemeberRegistration{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", emailAddress='" + emailAddress + '\'' +
//                ", preferdSport='" + preferdSport + '\'' +
//                ", id='" + id + '\'' +
//                '}';
//    }
//}
