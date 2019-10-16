//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class GymMemberUpdateDetails  {
//    @Id
//    private String detailsId;
//    private String name;
//    private String surname;
//
//    private GymMemberUpdateDetails(){}
//
//    private GymMemberUpdateDetails(Builder builder){
//        this.detailsId=builder.detailsId;
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
//        public Builder Copy(GymMemberUpdateDetails gymMemberUpdateDetails){
//            this.detailsId = gymMemberUpdateDetails.detailsId;
//            this.name = gymMemberUpdateDetails.name;
//            this.surname = gymMemberUpdateDetails.surname;
//
//            return this;
//        }
//        public GymMemberUpdateDetails build(){return new GymMemberUpdateDetails(this);}
//
//    }
//
//    @Override
//    public String toString() {
//        return "GymMemberUpdateDetails{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", detailsId='" + detailsId + '\'' +
//                '}';
//    }
//}
