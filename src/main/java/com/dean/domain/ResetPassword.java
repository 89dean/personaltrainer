package com.dean.domain;

public class ResetPassword {
    private String emailAddress;

    private ResetPassword(){}

    private ResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(String emailAddress){return emailAddress;}

    public static class Builder{
        private String emailAddress;

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public ResetPassword build(){
            return new ResetPassword(this);
        }
    }


}
