package com.dean.domain;

public class CustomerRegistration {
    private RegistrationForm registrationForm;


    private CustomerRegistration(){}

    private CustomerRegistration(Builder builder){
        this.registrationForm=builder.registrationForm;
    }
    public static class Builder{

        private RegistrationForm registrationForm;

        public Builder registrationForm(RegistrationForm registrationForm){
            this.registrationForm=registrationForm;
            return this;
        }

        public CustomerRegistration build(){return new CustomerRegistration(this);}

    }
}
