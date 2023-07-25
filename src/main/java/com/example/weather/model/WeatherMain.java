package com.example.weather.model;

import java.math.BigDecimal;

public class WeatherMain {
    private BigDecimal temp;
    private BigDecimal humidity;

    public WeatherMain() {
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherMain{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
