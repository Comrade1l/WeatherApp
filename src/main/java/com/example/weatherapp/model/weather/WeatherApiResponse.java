package com.example.weatherapp.model.weather;

import lombok.Data;

import java.util.List;

@Data
public class WeatherApiResponse {

    private Main main;
    private List<Weather> weather;

}
