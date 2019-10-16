//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class TrainerAcceptance {
//    @Id
//    private String acceptanceId;
//    private String name;
//    private String surname;
//    private String message;
//
//    private TrainerAcceptance(){ }
//
//    private TrainerAcceptance(Builder builder){
//        this.acceptanceId=builder.acceptanceId;
//        this.name=builder.name;
//        this.surname=builder.surname;
//        this.message=builder.message;
//    }
//
//    public String getAcceptanceId() {
//        return acceptanceId;
//    }
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//    public String getMessage(){return message;}
//
//
//    public static class Builder{
//        private String acceptanceId;
//        private String name;
//        private String surname;
//        private String message;
//
//        public Builder acceptanceId(String id){
//            this.acceptanceId=id;
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
//        public Builder message(String message){
//            this.message=message;
//            return this;
//        }
//        public Builder Copy(TrainerAcceptance trainerAcceptance){
//            this.acceptanceId = trainerAcceptance.acceptanceId;
//            this.name = trainerAcceptance.name;
//            this.surname = trainerAcceptance.surname;
//            this.message = trainerAcceptance.message;
//
//
//            return this;
//        }
//        public TrainerAcceptance build(){return new TrainerAcceptance (this);}
//    }
//
//    @Override
//    public String toString() {
//        return "TrainerAcceptance{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", message='" + message + '\'' +
//                ", acceptanceId='" + acceptanceId + '\'' +
//                '}';
//    }
//}
