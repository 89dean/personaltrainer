//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class TrainerRegistration {
//    @Id
//    private String registrationId;
//    private String name;
//    private String surname;
//    private String emailAddress;
//
//    private TrainerRegistration(){}
//
//    private TrainerRegistration(Builder builder){
//        this.registrationId = builder.registrationId;
//        this.name = builder.name;
//        this.surname = builder.surname;
//        this.emailAddress = builder.emailAddress;
//
//
//    }
//
//    public String getRegistrationId() {
//        return registrationId;
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
//
//
//
//    public static class Builder{
//        private String registrationId;
//        private String name;
//        private String surname;
//        private String emailAddress;
//
//        public Builder registrationId(String id){
//            this.registrationId = id;
//            return this;
//        }
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
//
//        public Builder Copy(TrainerRegistration trainerRegistration){
//            this.registrationId = trainerRegistration.registrationId;
//            this.name = trainerRegistration.name;
//            this.surname = trainerRegistration.surname;
//            this.emailAddress = trainerRegistration.emailAddress;
//
//            return this;
//        }
//        public TrainerRegistration build(){
//            return new TrainerRegistration(this);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "TrainerRegistration{" +
//                "registrationId='" + registrationId + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", emailAddress='" + emailAddress + '\'' +
//                '}';
//    }
//}
