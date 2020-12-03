package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {
        double sum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size() ;
    }

    public double calculateMedianTemperature() {
        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }

        Collections.sort(temperaturesList);
        int middle = temperaturesList.size()/2;
        if (temperaturesList.size() % 2 == 0) {
            return 0.5 * (temperaturesList.get(middle) + temperaturesList.get(middle-1));
        } else {
            return temperaturesList.get(middle).doubleValue();
        }
    }
}