package com.example.weatherapp.model.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Main {

    private float temp;

    @JsonProperty("feels_like")
    private float feelsLike;


}
