package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightManager {

    private List<Flight> allFlights() {
        return List.of(
                new Flight("KTW", "WAW"),
                new Flight("WAW", "MIA"),
                new Flight("KTW", "MUC"),
                new Flight("MUC", "MIA"),
                new Flight("KRK", "MUC"),
                new Flight("KRK", "FRA"),
                new Flight("WAW", "PAR")
        );
    }

    public List<Flight> findFlightsFrom(String from) {
        return allFlights().stream()
                .filter(f -> f.getDeparture().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String to) {
        return allFlights().stream()
                .filter(f -> f.getArrival().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsThrough(String from, String via, String to) {
        List<Flight> step1 = allFlights().stream()
                .filter(f -> f.getDeparture().equals(from))
                .filter(f -> f.getArrival().equals(via))
                .toList();
        List<Flight> step2 = allFlights().stream()
                .filter(f -> f.getDeparture().equals(via))
                .filter(f -> f.getArrival().equals(to))
                .toList();
        List<Flight> result = new ArrayList<>();
        result.addAll(step1);
        result.addAll(step2);
        return result;
    }
}
