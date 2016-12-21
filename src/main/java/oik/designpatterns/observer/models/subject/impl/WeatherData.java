package main.java.oik.designpatterns.observer.models.subject.impl;

import main.java.oik.designpatterns.observer.models.observer.Observer;
import main.java.oik.designpatterns.observer.models.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int position = observers.indexOf(observer);

        if (position >= 0) {
            observers.remove(position);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }
}
