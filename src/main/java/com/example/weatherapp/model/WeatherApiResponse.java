package com.example.weatherapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class WeatherApiResponse {

    private Main main;
    private List<Weather> weather;

}
