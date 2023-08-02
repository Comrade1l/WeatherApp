package com.example.weatherapp.model.forecast;

import lombok.Data;

import java.util.List;

@Data
public class ForecastData {

    private String city;
    private List<ForecastList> list;

}
