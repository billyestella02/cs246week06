package com.example.weatherreport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*private TextView singleCityExperiment;
    private TextView cityName;
    private TextView measurementsText;
    private TextView measurements;
    private TextView forecastInformationText;
    private TextView multipleCityExperiments;
    private TextView citiesMultiple;
    private TextView citiesMaxTempText;
    private TextView citiesMaxTemp;
    private TextView citiesMaxWindSpeedText;
    private TextView citiesMaxWindSpeed;*/

    private TextView enterCity;
    private EditText cityInput;
    private TextView forecastInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*// add elements to activity
        singleCityExperiment = (TextView) findViewById(R.id.single_city_experiment);
        cityName = (TextView) findViewById(R.id.city_name);
        measurementsText = (TextView) findViewById(R.id.measurements_text);
        measurements = (TextView) findViewById(R.id.measurements);
        forecastInformationText = (TextView) findViewById(R.id.forecast_information_text);

        multipleCityExperiments = (TextView) findViewById(R.id.multiple_city_experiments);
        citiesMultiple = (TextView) findViewById(R.id.cities_multiple);
        citiesMaxTempText = (TextView) findViewById(R.id.cities_max_temp_text);
        citiesMaxTemp = (TextView) findViewById(R.id.cities_max_temp);
        citiesMaxWindSpeedText = (TextView) findViewById(R.id.cities_max_wind_speed_text);
        citiesMaxWindSpeed = (TextView) findViewById(R.id.cities_max_wind_speed);*/

        enterCity = (TextView) findViewById(R.id.enter_city);
        cityInput = (EditText) findViewById(R.id.city_input);
        forecastInformation = (TextView) findViewById(R.id.forecast_information);

        SingleCityExperimenter singleCityExperimenter = new SingleCityExperimenter(cityInput.getText().toString());
        forecastInformation.setText(singleCityExperimenter.singleCityForecast());

        // new MultipleCityExperimenter().compareCityList();
    }

}
