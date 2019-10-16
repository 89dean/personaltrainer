package com.dean.util;

import java.util.UUID;

public class Misc {

    public static int generateId(){
        return Integer.parseInt(UUID.randomUUID().toString());

//        return UUID.randomUUID().toString();
    }

}
