package com.dean.domain;

public class RegistrationForm {
    private String name,surname,emailAddress,preferdSport;

    private RegistrationForm(){}

    private RegistrationForm(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.emailAddress = builder.emailAddress;
        this.preferdSport = builder.preferedSport;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPreferdSport() {
        return preferdSport;
    }

    public static class Builder{
        private String name,surname,emailAddress,preferedSport;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder prferedSport(String preferedSport){
            this.preferedSport = preferedSport;
            return this;
        }
        public RegistrationForm build(){
            return new RegistrationForm(this);
        }
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", preferdSport='" + preferdSport + '\'' +
                '}';
    }
}
