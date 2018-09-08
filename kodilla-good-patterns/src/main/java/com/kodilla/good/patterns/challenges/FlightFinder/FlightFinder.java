package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashSet;
import java.util.Set;

public class FlightFinder {
    private Set<Flight> flights = new HashSet <>();

    public FlightFinder(){
        flights.add(new Flight("Katowice","Warszawa"));
        flights.add(new Flight("Warszawa","Moskwa"));
        flights.add(new Flight("Londyn","Moskwa"));
        flights.add(new Flight("Paryż","Wiedeń"));
        flights.add(new Flight("Katowice","Lizbona"));
        flights.add(new Flight("Madryt","Lizbona"));
        flights.add(new Flight("Oslo","Warszawa"));
        flights.add(new Flight("Tokio","Dublin"));
        flights.add(new Flight("Nowy Jork","Sydney"));
        flights.add(new Flight("Gdańsk","Warszawa"));
    }

    public Set<Flight> getFlightsFromCity(String startingPoint) {
        return flights;
    }

    public Set<Flight> getFlightsToCity (String endPoint) {
        return flights;
    }

    public Set<Flight> getFlightsWith (String startingPoint, String endPoint){
        return  flights;
    }
}
