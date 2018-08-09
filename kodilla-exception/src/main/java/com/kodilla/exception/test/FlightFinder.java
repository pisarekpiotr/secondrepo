package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flights = new HashMap<>();

        flights.put("Katowice", true);
        flights.put("Rome", true);
        flights.put("Paris", true);
        flights.put("Madrid", true);
        flights.put("London", false);
        flights.put("Tokyo", true);
        flights.put("Berlin", false);
        flights.put("Bytom", false);

        if (!flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Flight not found");
        }
        return flights.get(flight.getArrivalAirport());
    }

    public static void main(String[] args) {

        try {
            Flight flight = new Flight("Warsaw", "Tokyo");
            FlightFinder flightFinder = new FlightFinder();

            if (flightFinder.findFilght(flight)) {
                System.out.println("Flight possible");
            } else {
                System.out.println("Flight impossible");
            }

        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Operation completed");
        }
    }
}
