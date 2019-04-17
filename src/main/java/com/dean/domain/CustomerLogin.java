package com.dean.domain;

public class CustomerLogin {
    private LoginDetails loginDetails;


    private CustomerLogin(){}

    private CustomerLogin(Builder builder){
        this.loginDetails=builder.loginDetails;
    }
    public static class Builder{

        private LoginDetails loginDetails;

        public Builder loginDetails(LoginDetails loginDetails){
            this.loginDetails=loginDetails;
            return this;
        }

        public CustomerLogin build(){return new CustomerLogin(this);}

    }
}
