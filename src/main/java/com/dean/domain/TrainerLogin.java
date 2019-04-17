package com.dean.domain;

public class TrainerLogin {
    private LoginDetails loginDetails;


    private TrainerLogin(){}

    private TrainerLogin(Builder builder){
        this.loginDetails=builder.loginDetails;
    }
    public static class Builder{

        private LoginDetails loginDetails;

        public Builder loginDetails(LoginDetails loginDetails){
            this.loginDetails=loginDetails;
            return this;
        }

        public TrainerLogin build(){return new TrainerLogin(this);}

    }
}
