package com.dean.domain;

public class LoginDetails {
    private String emailAddress,password;


    private LoginDetails(){}

    private LoginDetails(Builder builder){
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

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
        public LoginDetails build(){return new LoginDetails(this);}
    }

}
