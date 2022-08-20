package com.kodilla.exception.airport;

import java.util.HashMap;
import java.util.Map;

class FlightFinder {
    public boolean findFlightTo(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> allFlights = new HashMap<>();
        allFlights.put("KRK", true);
        allFlights.put("WAW", true);
        allFlights.put("MIA", false);
        allFlights.put("MUC", true);

        if (allFlights.containsKey(flight.getArrival())) {
            return allFlights.get(flight.getArrival());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
