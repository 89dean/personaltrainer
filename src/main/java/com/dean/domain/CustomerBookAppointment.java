package com.dean.domain;

import java.util.Objects;

public class CustomerBookAppointment implements Comparable<CustomerBookAppointment> {
    private String name,surname,title,time;

    private CustomerBookAppointment(){}

    private CustomerBookAppointment(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.title=builder.title;
        this.time=builder.time;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getTitle(){return title;}

    public String getTime(){return time;}

    @Override
    public int compareTo(CustomerBookAppointment o) {
        return this.name.compareTo(o.name);
    }

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
        public Builder Copy(CustomerBookAppointment customerBookAppointment){
            this.name = customerBookAppointment.name;
            this.surname = customerBookAppointment.surname;
            this.title = customerBookAppointment.title;
            this.time = customerBookAppointment.time;

            return this;
        }
        public CustomerBookAppointment build(){return new CustomerBookAppointment(this);}

    }

    @Override
    public String toString() {
        return "CustomerBookAppointment{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBookAppointment that = (CustomerBookAppointment) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}