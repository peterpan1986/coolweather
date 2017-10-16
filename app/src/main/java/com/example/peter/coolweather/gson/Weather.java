package com.example.peter.coolweather.gson;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    public List<Forecast> forecastList;

}
