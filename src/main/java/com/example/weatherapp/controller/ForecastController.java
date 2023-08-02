package com.example.weatherapp.controller;

import com.example.weatherapp.model.forecast.ForecastData;
import com.example.weatherapp.service.ForecastService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forecast")
@RequiredArgsConstructor
public class ForecastController {

    private final ForecastService forecastService;

    @GetMapping("/{city}")
    public ForecastData getForecastData(@PathVariable("city") String city) {
        return forecastService.getForecastData(city);
    }

}
