package com.dean.domain;

public class GymMemeberRegistration {
    private RegistrationForm registrationForm;


    private GymMemeberRegistration(){}

    private GymMemeberRegistration(Builder builder){
        this.registrationForm=builder.registrationForm;
    }
    public static class Builder{

        private RegistrationForm registrationForm;

        public Builder registrationForm(RegistrationForm registrationForm){
            this.registrationForm=registrationForm;
            return this;
        }

        public GymMemeberRegistration build(){return new GymMemeberRegistration(this);}

    }
}
