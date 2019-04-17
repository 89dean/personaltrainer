package com.dean.domain;

public class CustomerDetails {
    private LoginDetails loginDetails;


    private CustomerDetails(){}

    private CustomerDetails(Builder builder){
        this.loginDetails=builder.loginDetails;
    }
    public static class Builder{

        private LoginDetails loginDetails;

        public Builder loginDetails(LoginDetails loginDetails){
            this.loginDetails=loginDetails;
            return this;
        }

        public CustomerDetails build(){return new CustomerDetails(this);}

    }
}
