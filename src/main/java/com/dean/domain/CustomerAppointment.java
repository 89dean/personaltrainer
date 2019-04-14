package com.dean.domain;

public class CustomerAppointment {
    private String name,surname,title,time;

    private CustomerAppointment(){}

    private CustomerAppointment(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.title=builder.title;
        this.time=builder.time;
    }
    public String getName(String name){return name;}

    public String getSurname(String surname){return surname;}

    public String getTitle(String title){return title;}

    public String getTime(String time){return time;}

    public static class Builder{
        private String name,surname,title,time;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder title(String title){
            this.title=title;
            return this;
        }
        public Builder time(String time){
            this.time=time;
            return this;
        }
        public CustomerAppointment build(){return new CustomerAppointment(this);}

    }
}
