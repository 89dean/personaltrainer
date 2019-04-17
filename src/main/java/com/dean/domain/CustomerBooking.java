package com.dean.domain;

public class CustomerBooking {
    private BookAppointment bookAppointment;


    private CustomerBooking(){}

    private CustomerBooking(Builder builder){
        this.bookAppointment=builder.bookAppointment;
    }
    public static class Builder{

        private BookAppointment bookAppointment;

        public Builder loginDetails(BookAppointment bookAppointment){
            this.bookAppointment=bookAppointment;
            return this;
        }

        public CustomerBooking build(){return new CustomerBooking(this);}

    }
}
