package com.example.weatherreport;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class does the main part of the assignment (not the stretch challenge).
 */
public class SingleCityExperimenter {
    /**
     * Gets and displays the current conditions and forecast for a given city.
     */
    private String city;
    private String cityName;
    private String measurements;

    SingleCityExperimenter(String city) {
        this.city = city;
    }

    public String singleCityForecast() {
        WeatherDataLoader loader = new WeatherDataLoader();
        String singleCityInfo = "";
        try {
            //System.out.print("Enter city: ");
            //Scanner scanner = new Scanner(System.in);
            //String city = scanner.next();

            // This calls
            WeatherConditions conditions = loader.getWeather(city);

            // System.out.println("Name: " + conditions.getName());
            cityName = "Name: " + conditions.getName() + "\n";

            // System.out.println("Measurements: " + conditions.getMeasurements().toString());
            measurements = "Measurements: " + conditions.getMeasurements().toString() + "\n";

            WeatherForecast forecast = loader.getForecast(city);

            singleCityInfo = cityName + measurements + printForecast(forecast);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return singleCityInfo;
    }

    public String printForecast(WeatherForecast forecast) {
        // System.out.println("Forecast information:");
        String forecastInformation = "Forecast information: \n";

        for (WeatherForecastItem item : forecast.getForecastItems()) {
            String time = item.getDateText();
            float temp = item.getMeasurements().get("temp");

            String conditions = "";
            if (item.getDescriptions().size() > 0) {
                conditions = item.getDescriptions().get(0).getDescription();
            }

            float wind = item.getWind().get("speed");

            //System.out.println(String.format("Time: %s, Temp: %sF, Conditions: %s, Wind Speed: %smph",
            //       time, temp, conditions, wind));

            String forecastItem = "Time: " + time + " Temp: " + temp + " Conditions: " + conditions + " Wind Speed: wind\n";
            forecastInformation += forecastItem;
        }
        return forecastInformation;
    }


}
