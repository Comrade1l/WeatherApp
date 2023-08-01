package com.example.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Main {

    private float temp;


    @JsonProperty("feels_like")
    private float feelsLike;


}
