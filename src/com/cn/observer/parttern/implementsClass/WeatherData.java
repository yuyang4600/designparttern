package com.cn.observer.parttern.implementsClass;

import com.cn.observer.parttern.rootInterface.Observer;
import com.cn.observer.parttern.rootInterface.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList ;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observerList.size(); i ++) {
           Observer observer = (Observer)observerList.get(i);
           observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChange() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }


}
