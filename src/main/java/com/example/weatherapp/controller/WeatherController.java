package com.example.weatherapp.controller;

import com.example.weatherapp.model.WeatherData;
import com.example.weatherapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather/{city}")
    public WeatherData getWeatherData(@PathVariable("city") String city) {
        return weatherService.getWeatherData(city);
    }
}
