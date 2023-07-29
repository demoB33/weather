package com.example.weather.model;

import java.math.BigDecimal;

public class WeatherWind {

    private BigDecimal speed;
    private Integer deg;

    public WeatherWind() {
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "WeatherWind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}