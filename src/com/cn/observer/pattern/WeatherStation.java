package com.cn.observer.pattern;

import com.cn.observer.pattern.implementsClass.CurrentConditionsDisplay;
import com.cn.observer.pattern.implementsClass.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(25, 10, 30.4f);
        weatherData.setMeasurements(26, 11, 31.4f);
        weatherData.setMeasurements(27, 12, 32.4f);
        weatherData.setMeasurements(30, 30, 30);
    }
}
