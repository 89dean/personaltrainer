package com.dean.domain;

import java.util.Objects;

public class CustomerLogin implements Comparable<CustomerLogin>{
    private String emailAddress,password;


    private CustomerLogin(){}

    private CustomerLogin(Builder builder){
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    @Override
    public int compareTo(CustomerLogin o) {
        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String emailAddress,password;

        public Builder emailAddress(String emailAddress){
            this.emailAddress=emailAddress;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }
        public Builder Copy(CustomerLogin customerLogin){
            this.emailAddress = customerLogin.emailAddress;
            this.password = customerLogin.password;

            return this;
        }
        public CustomerLogin build(){return new CustomerLogin(this);}
    }

    @Override
    public String toString() {
        return "CustomerLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerLogin that = (CustomerLogin) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
