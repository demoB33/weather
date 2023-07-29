package com.example.weather.service;

import com.example.weather.model.Weather;

public interface WeatherService {
    Weather getWeather(String city);
}
