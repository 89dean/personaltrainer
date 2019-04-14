package com.dean.factory;

import com.dean.domain.CustomerAppointment;

public class CustomerAppointmentFactory {

    public static CustomerAppointment getCustomerAppointment(String name,String surname,String title,String time){
        return new CustomerAppointment.Builder().name(name)
                .surname(surname)
                .title(title)
                .time(time)
                .build();

    }
}
