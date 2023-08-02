package com.example.weatherapp.model.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ForecastList {

    private Long dt;
    @JsonProperty("dt_txt")
    private String dtTxt;
    private Main main;
    private List<Weather> weather;

}
