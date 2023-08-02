package com.example.weatherapp.service;

import com.example.weatherapp.model.forecast.ForecastApiResponse;
import com.example.weatherapp.model.forecast.ForecastData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ForecastService {

    @Value("${openweathermap.api.key}")
    private String apiKey;
    private static final String API_URL =
            "https://api.openweathermap.org/data/2.5/forecast?q={city}&appid={apiKey}&units=metric&lang=ru";

    private final RestTemplate restTemplate;

    public ForecastData getForecastData(String city) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("city", city);
        uriVariables.put("apiKey", apiKey);

        ForecastApiResponse response = restTemplate.getForObject(API_URL, ForecastApiResponse.class, uriVariables);

        ForecastData forecastData = new ForecastData();
        forecastData.setCity(city);
        forecastData.setList(response.getForecastLists());
        return forecastData;
    }

}
