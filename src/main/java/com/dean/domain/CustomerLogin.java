//package com.dean.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//public class CustomerLogin implements Comparable<CustomerLogin> {
//    @Id
//    private String loginId;
//    private String emailAddress;
//    private String password;
//
//
//    private CustomerLogin(){}
//
//    private CustomerLogin(Builder builder){
//        this.loginId=builder.loginId;
//        this.emailAddress=builder.emailAddress;
//        this.password=builder.password;
//
//    }
//    public String getLoginId(){return loginId;}
//
//    public String getEmailAddress(){return emailAddress;}
//
//    public String getPassword(){return password;}
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CustomerLogin)) return false;
//        CustomerLogin customerLogin = (CustomerLogin) o;
//        return getLoginId().equals(customerLogin.getLoginId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getLoginId());
//    }
//
//    @Override
//    public String toString() {
//        return "CustomerLogin{" +
//                "emailAddress='" + emailAddress + '\'' +
//                ", password='" + password + '\'' +
//                ", loginId='" + loginId + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(CustomerLogin customerLogin) {
//        return this.getLoginId().compareToIgnoreCase(customerLogin.loginId);
//    }
//
//    public static class Builder{
//        private String loginId;
//        private String emailAddress;
//        private String password;
//
//
//        public Builder loginId(String id){
//            this.loginId=id;
//            return this;
//        }
//        public Builder emailAddress(String emailAddress){
//            this.emailAddress=emailAddress;
//            return this;
//        }
//        public Builder password(String password){
//            this.password=password;
//            return this;
//        }
//        public Builder Copy(CustomerLogin customerLogin){
//            this.loginId=customerLogin.loginId;
//            this.emailAddress = customerLogin.emailAddress;
//            this.password = customerLogin.password;
//
//            return this;
//        }
//        public CustomerLogin build(){return new CustomerLogin(this);}
//    }
//}
