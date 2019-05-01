package com.dean.factory;

import com.dean.domain.CustomerBookAppointment;

public class CustomerBookAppointmentFactory {

    public static CustomerBookAppointment getCustomerBookAppointment(String name,String surname,String title,String time){
        return new CustomerBookAppointment.Builder().name(name).surname(surname).title(title).time(time)
                .build();

    }
}
