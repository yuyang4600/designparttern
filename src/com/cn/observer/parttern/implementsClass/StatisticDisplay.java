package com.cn.observer.parttern.implementsClass;

import com.cn.observer.parttern.rootInterface.DisplayElement;
import com.cn.observer.parttern.rootInterface.Observer;
import com.cn.observer.parttern.rootInterface.Subject;

public class StatisticDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("i am static display, temp is " + temp + " ,humidity is " + humidity + " , pressure is " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
