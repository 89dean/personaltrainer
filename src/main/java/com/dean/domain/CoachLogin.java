package com.dean.domain;

public class CoachLogin {
    private LoginDetails loginDetails;


    private CoachLogin(){}

    private CoachLogin(Builder builder){
        this.loginDetails=builder.loginDetails;
    }
    public static class Builder{

        private LoginDetails loginDetails;

        public Builder loginDetails(LoginDetails loginDetails){
            this.loginDetails=loginDetails;
            return this;
        }

        public CoachLogin build(){return new CoachLogin(this);}

    }
}
