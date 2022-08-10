package com.kodilla.testing.weather.stub;

import java.util.*;

class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverage() {
        double sum = 0;
        for (Double temperature : temperatures.getTemperatures().values()) {
            sum += temperature;
        }
        return sum / temperatures.getTemperatures().size();
    }
 public double calculateMedian() {
     List<Double> sortedTemps = new ArrayList<>(temperatures.getTemperatures().values());
     Collections.sort(sortedTemps);
    //10 12 14 16, indeksy 0,1,2,3,
    //10 12 14 16 18 indeksy 0,1,2,3,4,
     double result = 0;
     if (sortedTemps.size() % 2 == 0) {
        double left = sortedTemps.get(sortedTemps.size() / 2 - 1); //indeksy a wartości pola
        double right = sortedTemps.get(sortedTemps.size() / 2);
        result = (left + right) / 2;
     } else {
         result = sortedTemps.get((int) Math.floor(sortedTemps.size() / 2));
     }
     return result;
 }
}
