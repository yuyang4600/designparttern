package com.cn.observer.parttern;

import com.cn.observer.parttern.implementsClass.CurrentConditionsDisplay;
import com.cn.observer.parttern.implementsClass.StatisticDisplay;
import com.cn.observer.parttern.implementsClass.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(25, 10, 30.4f);
        weatherData.setMeasurements(26, 11, 31.4f);
        weatherData.setMeasurements(27, 12, 32.4f);
        weatherData.setMeasurements(30, 30, 30);
    }
}
