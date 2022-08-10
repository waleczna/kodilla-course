package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WeatherForecastTestSuite {
    @ExtendWith(MockitoExtension.class)
    class WeatherForecastTestSuite {

        @Mock
        private Temperatures temperaturesMock;

        @Test
        void testCalculateForecastWithMock() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }

        @Test
        void shouldCalculateAverageTemperature() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 21.0);
            temperaturesMap.put("Krakow", 22.0);
            temperaturesMap.put("Wroclaw", 23.0);
            temperaturesMap.put("Warszawa", 24.0);
            temperaturesMap.put("Gdansk", 25.0);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When
            double result = weatherForecast.calculateAverage();
            //Then
            assertEquals(22, result, 0.001);
        }
        @Test
        void shouldCalculateMedianTemperature() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 22.0);
            temperaturesMap.put("Krakow", 21.0);
            temperaturesMap.put("Warszawa", 24.0);
            temperaturesMap.put("Gdansk", 23.0);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When
            double result = weatherForecast.calculateMedian();
            //Then
            assertEquals(22.5, result, 0.001);
        }
    }
}