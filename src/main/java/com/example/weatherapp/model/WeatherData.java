package com.example.weatherapp.model;

import lombok.Data;

@Data
public class WeatherData {

    private String city;
    private float temperature;
    private float feelsLike;
    private String main;
    private String description;

}
