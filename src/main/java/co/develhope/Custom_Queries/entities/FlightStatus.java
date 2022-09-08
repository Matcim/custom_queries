package co.develhope.Custom_Queries.entities;

import java.util.Random;



public enum FlightStatus {

    ONETIME,
    DELAYED,
    CANCELLED;

    private static final Random random = new Random();
   public static FlightStatus getRandom(){
        FlightStatus[] flightStatuses = values();
        return flightStatuses[random.nextInt(flightStatuses.length)];
    }
}
