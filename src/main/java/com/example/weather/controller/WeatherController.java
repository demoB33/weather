package com.example.weather.controller;

import com.example.weather.model.Weather;
import com.example.weather.service.WeatherService;
import com.example.weather.service.WeatherServiceProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/{city}")
    public ResponseEntity<Weather> getWeather(@PathVariable("city") String city) {
        Weather weather = weatherService.getWeather(city);
        return ResponseEntity.ok(weather);
    }
}
