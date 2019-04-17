package com.dean.domain;

public class CoachDetails {
    private LoginDetails loginDetails;


    private CoachDetails(){}

    private CoachDetails(Builder builder){
        this.loginDetails=builder.loginDetails;
    }
    public static class Builder{

        private LoginDetails loginDetails;

        public Builder loginDetails(LoginDetails loginDetails){
            this.loginDetails=loginDetails;
            return this;
        }

        public CoachDetails build(){return new CoachDetails(this);}

    }
}
