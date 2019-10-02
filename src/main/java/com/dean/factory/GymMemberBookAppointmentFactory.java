package com.dean.factory;

import com.dean.domain.GymMemberBookAppointment;
import com.dean.util.Misc;

public class GymMemberBookAppointmentFactory {

    public static GymMemberBookAppointment getGymMemberBookAppointment(String name,String surname,String title,String time){
        return new GymMemberBookAppointment.Builder().name(name).surname(surname).title(title).time(time).appointmentId(Misc.generateId())
                .build();
    }
}
