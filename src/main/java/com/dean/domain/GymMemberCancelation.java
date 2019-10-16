//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class GymMemberCancelation {
//    @Id
//    private String cancelationId;
//    private String name;
//    private String surname;
//    private String cancelMessage;
//
//    private GymMemberCancelation(){}
//
//    private GymMemberCancelation(Builder builder){
//        this.cancelationId=builder.cancelationId;
//        this.name=builder.name;
//        this.surname=builder.surname;
//        this.cancelMessage=builder.cancelMessage;
//
//    }
//
//    public String getCancelationId() {
//        return cancelationId;
//    }
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//    public String getCancelMessage(){return cancelMessage;}
//
//
//    public static class Builder{
//        private String cancelationId;
//        private String name;
//        private String surname;
//        private String cancelMessage;
//
//
//        public Builder cancelationId(String id){
//            this.cancelationId=id;
//            return this;
//        }
//        public Builder name(String name){
//            this.name=name;
//            return this;
//        }
//        public Builder surname(String surname){
//            this.surname=surname;
//            return this;
//        }
//        public Builder cancelMessage(String cancelMessage){
//            this.cancelMessage=cancelMessage;
//            return this;
//        }
//        public Builder Copy(GymMemberCancelation gymMemberCancelation){
//            this.cancelationId = gymMemberCancelation.cancelationId;
//            this.cancelMessage = gymMemberCancelation.cancelMessage;
//            this.name = gymMemberCancelation.name;
//            this.surname = gymMemberCancelation.surname;
//
//            return this;
//        }
//        public GymMemberCancelation build(){return new GymMemberCancelation(this);}
//    }
//
//    @Override
//    public String toString() {
//        return "GymMemberCancelation{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", cancelMessage='" + cancelMessage + '\'' +
//                ", cancelationId='" + cancelationId + '\'' +
//                '}';
//    }
//}
