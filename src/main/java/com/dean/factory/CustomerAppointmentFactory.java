package com.dean.factory;

import com.dean.domain.BookAppointment;

public class CustomerAppointmentFactory {

    public static BookAppointment getCustomerAppointment(String name, String surname, String title, String time){
        return new BookAppointment.Builder().name(name)
                .surname(surname)
                .title(title)
                .time(time)
                .build();

    }
}
