package com.dean.domain;

public class GymMemberBooking {
    private BookAppointment bookAppointment;


    private GymMemberBooking(){}

    private GymMemberBooking(Builder builder){
        this.bookAppointment=builder.bookAppointment;
    }
    public static class Builder{

        private BookAppointment bookAppointment;

        public Builder loginDetails(BookAppointment bookAppointment){
            this.bookAppointment=bookAppointment;
            return this;
        }

        public GymMemberBooking build(){return new GymMemberBooking(this);}

    }
}
