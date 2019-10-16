//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class CustomerUpdateDetails implements Comparable<CustomerUpdateDetails>{
//    @Id
//    private String detailsId;
//    private String name;
//    private String surname;
//
//
//    private CustomerUpdateDetails(){}
//
//    private CustomerUpdateDetails(Builder builder){
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
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CustomerUpdateDetails)) return false;
//        CustomerUpdateDetails customerUpdateDetails = (CustomerUpdateDetails) o;
//        return getDetailsId().equals(customerUpdateDetails.getDetailsId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getDetailsId());
//    }
//
//    @Override
//    public String toString() {
//        return "CustomerUpdateDetails{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", detailsId='" + detailsId + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(CustomerUpdateDetails customerUpdateDetails) {
//        return this.getDetailsId().compareToIgnoreCase(customerUpdateDetails.getDetailsId());
//    }
//
//
//    public static class Builder{
//        private String detailsId;
//        private String name;
//        private String surname;
//
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
//        public Builder Copy(CustomerUpdateDetails customerUpdateDetails){
//            this.detailsId = customerUpdateDetails.detailsId;
//            this.name = customerUpdateDetails.name;
//            this.surname = customerUpdateDetails.surname;
//
//            return this;
//        }
//        public CustomerUpdateDetails build(){return new CustomerUpdateDetails(this);}
//
//    }
//
//}
