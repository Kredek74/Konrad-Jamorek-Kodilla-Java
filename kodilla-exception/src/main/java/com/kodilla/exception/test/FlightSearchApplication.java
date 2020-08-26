package com.kodilla.exception.test;

public class FlightSearchApplication {

    public static void main(String[] args) {
        Flight flight = new Flight("Radom", "CPK");
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.addAirConnection("Szymany", true);

        try {
            if (flightSearch.flightSearching(flight)) {
                System.out.println("Air Connection is possible");
            }
            else {
                System.out.println("Air Connection is not possible");
            }
        } catch ( RouteNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
