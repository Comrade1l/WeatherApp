package com.example.weatherapp.model.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ForecastApiResponse {

    @JsonProperty("list")
    private List<ForecastList> forecastLists;

}
