package oik.designpatterns.observer.models.observer.impl;

import oik.designpatterns.observer.models.DisplayElement;
import oik.designpatterns.observer.models.observer.Observer;
import oik.designpatterns.observer.models.subject.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private double temperature;
    private double humidity;
    private double heatIndex;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    private double getHeatIndex(double t, double rh) {
        double index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.heatIndex = getHeatIndex(temp, humidity);
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index: " + heatIndex);
    }
}
