//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class CustomerResetPassword implements Comparable<CustomerResetPassword> {
//    @Id
//    private String resetId;
//    private String emailAddress;
//
//    private CustomerResetPassword(){}
//
//    private CustomerResetPassword(Builder builder){
//        this.resetId = builder.resetId;
//        this.emailAddress = builder.emailAddress;
//
//    }
//    public String getEmailAddress(){return emailAddress;}
//
//    public String getResetId() {
//        return resetId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CustomerResetPassword)) return false;
//        CustomerResetPassword customerResetPassword = (CustomerResetPassword) o;
//        return getResetId().equals(customerResetPassword.getResetId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getResetId());
//    }
//
//    @Override
//    public String toString() {
//        return "CustomerResetPassword{" +
//                "emailAddress='" + emailAddress + '\'' +
//                ", resetId='" + resetId + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(CustomerResetPassword customerResetPassword) {
//        return this.getResetId().compareToIgnoreCase(customerResetPassword.resetId);
//    }
//
//    public static class Builder{
//        private String resetId;
//        private String emailAddress;
//
//        public Builder resetId(String resetId){
//            this.resetId = resetId;
//            return this;
//        }
//        public Builder emailAddress(String emailAddress){
//            this.emailAddress = emailAddress;
//            return this;
//        }
//        public Builder Copy(CustomerResetPassword customerResetPassword){
//            this.resetId = customerResetPassword.resetId;
//            this.emailAddress = customerResetPassword.emailAddress;
//
//            return this;
//        }
//        public CustomerResetPassword build(){
//            return new CustomerResetPassword(this);
//        }
//    }
//
//
//}
