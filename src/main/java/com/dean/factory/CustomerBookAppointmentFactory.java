//package com.dean.factory;
//
//import com.dean.domain.CustomerBookAppointment;
//import com.dean.util.Misc;
//
//public class CustomerBookAppointmentFactory {
//
//    public static CustomerBookAppointment getCustomerBookAppointment(String name,String surname,String title,String time){
//        return new CustomerBookAppointment.Builder().name(name).surname(surname).title(title).time(time).appointmentId(Misc.generateId())
//                .build();
//
//    }
//}
