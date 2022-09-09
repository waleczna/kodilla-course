package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {
    public static Map<String, List<String>> getMovies() { //all entry objects:
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        System.out.println(getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining(" ! ")));

        //getMovies().entrySet().stream() //at the end of writing this code we put this fragment to sout above

        //you cannot play a stream on the map bacause the map does not implement collection interface
        //but the map gives us the entrySet of entry object, each object consisting of a key and a value:

                //.map(e -> e.getValue())

        //we want to switch to values in objects, i.e. internal lists
        //(map and some entry) we want a value in the form of a string list
        //there are objects that are lists in the output
        //transition from the object that are lists to the object that are inside

                //.flatMap(l -> l.stream())

        //flattening the map, there is a list at the input, I run a stream of internal elements from this list in the middle

        //OR... CANCEL ABOVE .MAP AND .FLATMAP AND WRITE CODE IN ONE LINE as above - 33


        //Collector.joining - 6 objects connected with each other with exclamation marks
        //without an exclamation point at the beginning and end
        //as arguments can be: delimiter only OR delimiter with prefix and with suffix, we chose the first option

        //and everything should be displayed as above: sout

    }
}

