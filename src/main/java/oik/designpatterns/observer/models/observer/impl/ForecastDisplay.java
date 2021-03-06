package oik.designpatterns.observer.models.observer.impl;

import oik.designpatterns.observer.models.DisplayElement;
import oik.designpatterns.observer.models.observer.Observer;
import oik.designpatterns.observer.models.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private double currentPressure = 29.92f;
    private double lastPressure;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");

        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
