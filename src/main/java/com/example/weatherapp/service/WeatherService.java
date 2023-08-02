package com.example.weatherapp.service;

import com.example.weatherapp.model.weather.Weather;
import com.example.weatherapp.model.weather.WeatherApiResponse;
import com.example.weatherapp.model.weather.WeatherData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WeatherService {

    @Value("${openweathermap.api.key}")
    private String apiKey;
    private static final String API_URL =
            "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric&lang=ru";

    private final RestTemplate restTemplate;

    public WeatherData getWeatherData(String city) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("city", city);
        uriVariables.put("apiKey", apiKey);

        WeatherApiResponse response = restTemplate.getForObject(API_URL, WeatherApiResponse.class, uriVariables);

        WeatherData weatherData = new WeatherData();
        weatherData.setCity(city);
        weatherData.setTemperature(response.getMain().getTemp());
        weatherData.setFeelsLike(response.getMain().getFeelsLike());

        for (Weather weather : response.getWeather()) {
            weatherData.setMain(weather.getMain());
            weatherData.setDescription(weather.getDescription());
        }

        return weatherData;
    }
}
