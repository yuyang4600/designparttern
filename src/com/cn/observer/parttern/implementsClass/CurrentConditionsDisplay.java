package com.cn.observer.parttern.implementsClass;

import com.cn.observer.parttern.rootInterface.DisplayElement;
import com.cn.observer.parttern.rootInterface.Observer;
import com.cn.observer.parttern.rootInterface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current condition: " + temperature + "F degress and " + humidity + " % humidity");
    }
}
