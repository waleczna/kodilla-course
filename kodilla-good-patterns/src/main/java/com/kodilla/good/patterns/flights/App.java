package com.kodilla.good.patterns.flights;

public class App {
    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();

        System.out.println("Finding flights from WAW:");
        System.out.println(flightManager.findFlightsFrom("WAW"));

        System.out.println("Finding flights to MIA:");
        System.out.println(flightManager.findFlightsTo("MIA"));

        System.out.println("Finding flights from KTW through MUC to MIA:");
        System.out.println(flightManager.findFlightsThrough("KTW", "MUC", "MIA"));
    }
}
