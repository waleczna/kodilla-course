package com.kodilla.exception.airport;

import java.util.ArrayList;
import java.util.List;

class FlightApp {
    public static void main(String[] args) {

        List<String> myText = new ArrayList<>();
        myText.add("a1");
        try {
            String s = myText.get(3);
        } catch (Exception e ) {
            System.out.println("Podałeś za dużą liczbę");
        }


        FlightFinder flightFinder = new FlightFinder();
        try {
            boolean result = flightFinder.findFlightTo(new Flight("KTW", "MIA"));
            System.out.println(result);
            result = flightFinder.findFlightTo(new Flight("KTW", "MUC"));
            System.out.println(result);
            result = flightFinder.findFlightTo(new Flight("KTW", "GDA"));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Unsupported airport!");
        }
    }

}
