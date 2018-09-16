package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private Set<Flight> flights = new HashSet<>();

    public FlightFinder() {
        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Warszawa", "Moskwa"));
        flights.add(new Flight("Londyn", "Moskwa"));
        flights.add(new Flight("Paryż", "Wiedeń"));
        flights.add(new Flight("Katowice", "Lizbona"));
        flights.add(new Flight("Madryt", "Lizbona"));
        flights.add(new Flight("Oslo", "Warszawa"));
        flights.add(new Flight("Tokio", "Dublin"));
        flights.add(new Flight("Nowy Jork", "Sydney"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Lizbona", "Warszawa"));
    }

    public Set<Flight> getFlightsFromCity(String startingPoint) {
        return flights.stream().filter(flight -> flight.getStartingPoint().equals(startingPoint)).collect(Collectors.toSet());
    }

    public Set<Flight> getFlightsToCity(String endPoint) {
        return flights.stream().filter(flight -> flight.getEndPoint().equals(endPoint)).collect(Collectors.toSet());
    }

    public Set<Flight> getFlightsWith(String startingPoint, String endPoint) {

        Set<Flight> getFlightFromCityReuse = getFlightsFromCity(startingPoint);
        Set<Flight> getFlightToCityReuse = getFlightsToCity(endPoint);
        Set<Flight> result = new LinkedHashSet<>();

        for (Flight flight: getFlightFromCityReuse) {
            for (Flight flight1: getFlightToCityReuse){
                if (flight.getEndPoint().equals(flight1.getStartingPoint()))
                {
                    result.add(flight);
                    result.add(flight1);
                }
            }
        }

        return result;
       // return flights.stream().filter(flight -> flight.getStartingPoint().equals(startingPoint)).filter(flight -> flight.getEndPoint().equals(endPoint)).collect(Collectors.toSet());
    }
}
