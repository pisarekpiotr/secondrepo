package com.kodilla.good.patterns.challenges.FlightFinder;

public class Application {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        System.out.println(flightFinder.getFlightsFromCity("Katowice"));
        System.out.println(flightFinder.getFlightsToCity("Katowice"));
        System.out.println(flightFinder.getFlightsWith("Katowice","Warszawa"));
    }
}
