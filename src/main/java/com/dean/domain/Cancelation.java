package com.dean.domain;

public class Cancelation {
    private String name,surname,cancelMessage;

    private Cancelation(){}

    private Cancelation(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.cancelMessage=builder.cancelMessage;

    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getCancelMessage(){return cancelMessage;}

    public static class Builder{
        private String name,surname,cancelMessage;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Cancelation build(){return new Cancelation(this);}
    }
}
