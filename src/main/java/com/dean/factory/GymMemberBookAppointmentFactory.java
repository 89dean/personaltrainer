package com.dean.factory;

import com.dean.domain.GymMemberBookAppointment;

public class GymMemberBookAppointmentFactory {

    public static GymMemberBookAppointment getGymMemberBookAppointment(String name,String surname,String title,String time){
        return new GymMemberBookAppointment.Builder().name(name).surname(surname).title(title).time(time)
                .build();
    }
}
