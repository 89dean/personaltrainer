package com.dean.domain;

public class CoachRegistration {
    private RegistrationForm registrationForm;


    private CoachRegistration(){}

    private CoachRegistration(Builder builder){
        this.registrationForm=builder.registrationForm;
    }
    public static class Builder{

        private RegistrationForm registrationForm;

        public Builder registrationForm(RegistrationForm registrationForm){
            this.registrationForm=registrationForm;
            return this;
        }

        public CoachRegistration build(){return new CoachRegistration(this);}

    }
}
