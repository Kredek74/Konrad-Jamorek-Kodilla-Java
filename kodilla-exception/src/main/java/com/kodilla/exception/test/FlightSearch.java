package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> mapOfFlights = new HashMap<>();

    public void addAirConnection(String arrivalAirPort, Boolean flightStatus) {
        this.mapOfFlights.put(arrivalAirPort, flightStatus);
    }

    public boolean flightSearching(Flight flight) throws RouteNotFoundException {

        boolean searchResult = false;
        if (mapOfFlights.containsKey(flight.getArrivalAirport())) {
            searchResult = mapOfFlights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("This airport does not exist in our database, the air connection is not feasible");
        }

        return searchResult;
    }
}
