//package com.dean.domain;
//
//import com.dean.factory.TrainerUpdateDetailsFactory;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class TrainerUpdateDetails {
//    @Id
//    private String detailsId;
//    private String name;
//    private String surname;
//
//    private TrainerUpdateDetails(){}
//
//    private TrainerUpdateDetails(Builder builder){
//        this.name=builder.name;
//        this.surname=builder.surname;
//    }
//
//    public String getDetailsId() {
//        return detailsId;
//    }
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//
//    public static class Builder{
//        private String detailsId;
//        private String name;
//        private String surname;
//
//        public Builder detailsId(String id){
//            this.detailsId=id;
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
//        public Builder Copy(TrainerUpdateDetails trainerUpdateDetails){
//            this.name = trainerUpdateDetails.name;
//            this.surname = trainerUpdateDetails.surname;
//
//            return this;
//        }
//        public TrainerUpdateDetails build(){return new TrainerUpdateDetails(this);}
//
//    }
//
//    @Override
//    public String toString() {
//        return "TrainerUpdateDetails{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", detailsId='" + detailsId + '\'' +
//                '}';
//    }
//}
