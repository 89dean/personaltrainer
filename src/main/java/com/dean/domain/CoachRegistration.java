//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class CoachRegistration implements Comparable<CoachRegistration>{
//    @Id
//    private String registrationId;
//    private String name;
//    private String surname;
//    private String emailAddress;
//
//    private CoachRegistration(){}
//
//    private CoachRegistration(Builder builder){
//        this.name = builder.name;
//        this.surname = builder.surname;
//        this.emailAddress = builder.emailAddress;
//        this.registrationId = builder.registrationId;
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
//    public String getRegistrationId(){return registrationId;}
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CoachRegistration)) return false;
//        CoachRegistration coachRegistration = (CoachRegistration) o;
//        return getRegistrationId().equals(coachRegistration.getRegistrationId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getRegistrationId());
//    }
//
//    @Override
//    public String toString() {
//        return "CoachRegistration{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", emailAddress='" + emailAddress + '\'' +
//                ", id='" + registrationId + '\'' +
//                '}';
//    }
//    @Override
//    public int compareTo(CoachRegistration coachRegistration) {
//        return this.getRegistrationId().compareToIgnoreCase(coachRegistration.registrationId);
//    }
//
//
//    public static class Builder{
//        private String registrationId;
//        private String name;
//        private String surname;
//        private String emailAddress;
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
//        public Builder registrationId(String id){
//            this.registrationId = id;
//            return this;
//        }
//        public Builder Copy(CoachRegistration coachRegistration){
//            this.registrationId = coachRegistration.registrationId;
//            this.name = coachRegistration.name;
//            this.surname = coachRegistration.surname;
//            this.emailAddress = coachRegistration.emailAddress;
//
//            return this;
//        }
//        public CoachRegistration build(){
//            return new CoachRegistration(this);
//        }
//    }
//
//
//}
