package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Objects;

public class Flight {
    private String startingPoint;
    private String endPoint;

    public Flight(String startingPoint, String endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(startingPoint, flight.startingPoint) &&
                Objects.equals(endPoint, flight.endPoint);
    }

    @Override
    public int hashCode() {

        return Objects.hash(startingPoint, endPoint);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startingPoint =" + startingPoint + '\'' +
                ", endPoint =" + endPoint + '\'' +
                '}';
    }
}
