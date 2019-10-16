//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class CoachUpdateDetails implements Comparable<CoachUpdateDetails>{
//    @Id
//    private String detailsId;
//    private String name;
//    private String surname;
//
//    private CoachUpdateDetails(){}
//
//    private CoachUpdateDetails(Builder builder){
//        this.detailsId=builder.detailsId;
//        this.name=builder.name;
//        this.surname=builder.surname;
//    }
//    public String getDetailsId(){return detailsId;}
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CoachUpdateDetails)) return false;
//        CoachUpdateDetails coachUpdateDetails = (CoachUpdateDetails) o;
//        return getDetailsId().equals(coachUpdateDetails.getDetailsId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getDetailsId());
//    }
//
//    @Override
//    public String toString() {
//        return "CoachUpdateDetails{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", detailsId='" + detailsId + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(CoachUpdateDetails coachUpdateDetails) {
//        return this.getDetailsId().compareToIgnoreCase(coachUpdateDetails.detailsId);
//    }
//
//        public static class Builder{
//            private String detailsId;
//            private String name;
//            private String surname;
//
//            public Builder detailsId(String id){
//                this.detailsId=id;
//                return this;
//            }
//        public Builder name(String name){
//            this.name=name;
//            return this;
//        }
//        public Builder surname(String surname){
//            this.surname=surname;
//            return this;
//        }
//        public Builder Copy(CoachUpdateDetails coachUpdateDetails){
//            this.detailsId=coachUpdateDetails.detailsId;
//            this.name=coachUpdateDetails.name;
//            this.surname=coachUpdateDetails.surname;
//            return this;
//        }
//        public CoachUpdateDetails build(){return new CoachUpdateDetails(this);}
//
//    }
//}
