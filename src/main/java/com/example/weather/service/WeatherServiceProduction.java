package com.example.weather.service;

import com.example.weather.model.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("production")
public class WeatherServiceProduction implements WeatherService {
//key e97ddf7f1d4dd701b2967a8725e7fea2
//key db5f2bf82f656b8998644e5b34aa9294
    private static String WEATHER_SERVICE_URL ="https://api.openweathermap.org/data/2.5/weather?q={city}&units=metrics&appid=e97ddf7f1d4dd701b2967a8725e7fea2";

    Logger logger = LoggerFactory.getLogger(WeatherServiceProduction.class);

    @Value("${weather.url}")
    private String weatherUrl;

    @Value("${weather.api-key}")
    private String weatherApiKey;

    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather(String city) {
        logger.debug("Requesting weather for city : {}", city);
        Weather weather = restTemplate.exchange(
                weatherUrl,
                HttpMethod.GET,
                new HttpEntity<>(HttpHeaders.EMPTY),
                Weather.class,
                        city,
                        weatherApiKey)
                .getBody();
        logger.debug("The weather for {} is {}" , city, weather);
        return weather;
    }
















}
