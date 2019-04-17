package com.dean.domain;

public class GymMemberLogin {
    private LoginDetails loginDetails;


    private GymMemberLogin(){}

    private GymMemberLogin(Builder builder){
        this.loginDetails=builder.loginDetails;
    }
    public static class Builder{

        private LoginDetails loginDetails;

        public Builder loginDetails(LoginDetails loginDetails){
            this.loginDetails=loginDetails;
            return this;
        }

        public GymMemberLogin build(){return new GymMemberLogin(this);}

    }
}
