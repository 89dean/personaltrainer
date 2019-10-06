package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class CustomerBookAppointment implements Comparable<CustomerBookAppointment>{
    @Id
    private String appointmentId;
    private String name;
    private String surname;
    private String title;
    private String time;

    private CustomerBookAppointment(){}

    private CustomerBookAppointment(Builder builder){
        this.appointmentId=builder.appointmentId;
        this.name=builder.name;
        this.surname=builder.surname;
        this.title=builder.title;
        this.time=builder.time;
    }
    public String getAppointmentId(){return appointmentId;}

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getTitle(){return title;}

    public String getTime(){return time;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerBookAppointment)) return false;
        CustomerBookAppointment customerBookAppointment = (CustomerBookAppointment) o;
        return getAppointmentId().equals(customerBookAppointment.getAppointmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentId());
    }

    @Override
    public String toString() {
        return "CustomerBookAppointment{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", appointmentId='" + appointmentId + '\'' +
                '}';
    }

    @Override
    public int compareTo(CustomerBookAppointment customerBookAppointment) {
        return this.getAppointmentId().compareToIgnoreCase(customerBookAppointment.appointmentId);
    }
    public static class Builder{
        private String appointmentId;
        private String name;
        private String surname;
        private String title;
        private String time;

        public Builder appointmentId(String id){
            this.appointmentId=id;
            return this;
        }
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
}
