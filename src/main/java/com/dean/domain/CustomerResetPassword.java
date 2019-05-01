package com.dean.domain;

import java.util.Objects;

public class CustomerResetPassword implements Comparable<CustomerResetPassword> {
    private String emailAddress;

    private CustomerResetPassword(){}

    private CustomerResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(){return emailAddress;}

    @Override
    public int compareTo(CustomerResetPassword o) {
        return this.emailAddress.compareTo(o.emailAddress);
    }

    public static class Builder{
        private String emailAddress;

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(CustomerResetPassword customerResetPassword){
            this.emailAddress = customerResetPassword.emailAddress;

            return this;
        }
        public CustomerResetPassword build(){
            return new CustomerResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "CustomerResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerResetPassword that = (CustomerResetPassword) o;
        return emailAddress.equals(that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
