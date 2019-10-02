package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Member Book Appointment")
public class GymMemberBookAppointment{
    @Id
    private String appointmentId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Title")
    private String title;
    @Column(name = "Time")
    private String time;

    private GymMemberBookAppointment(){}

    private GymMemberBookAppointment(Builder builder){
        this.appointmentId=builder.appointmentId;
        this.name=builder.name;
        this.surname=builder.surname;
        this.title=builder.title;
        this.time=builder.time;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getTitle(){return title;}

    public String getTime(){return time;}

    public static class Builder{
        private String name,surname,title,time,appointmentId;

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
        public Builder Copy(GymMemberBookAppointment gymMemberBookAppointment){
            this.appointmentId = gymMemberBookAppointment.appointmentId;
            this.title = gymMemberBookAppointment.title;
            this.name = gymMemberBookAppointment.name;
            this.surname = gymMemberBookAppointment.surname;
            this.time = gymMemberBookAppointment.time;

            return this;
        }
        public GymMemberBookAppointment build(){return new GymMemberBookAppointment(this);}

    }

    @Override
    public String toString() {
        return "GymMemberBookAppointment{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", appointmentId='" + appointmentId + '\'' +
                '}';
    }
}
