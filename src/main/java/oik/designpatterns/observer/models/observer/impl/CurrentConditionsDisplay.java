package oik.designpatterns.observer.models.observer.impl;

import oik.designpatterns.observer.models.DisplayElement;
import oik.designpatterns.observer.models.observer.Observer;
import oik.designpatterns.observer.models.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "  + humidity + "% humidity");
    }
}
