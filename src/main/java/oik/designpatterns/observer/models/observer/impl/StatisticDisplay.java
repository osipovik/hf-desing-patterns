package main.java.oik.designpatterns.observer.models.observer.impl;

import main.java.oik.designpatterns.observer.models.DisplayElement;
import main.java.oik.designpatterns.observer.models.observer.Observer;
import main.java.oik.designpatterns.observer.models.subject.Subject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private List<Double> temperatureHistory;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        temperatureHistory = new ArrayList<>();
    }

    @Override
    public void update(double temperature, double humiditi, double pressure) {
        temperatureHistory.add(temperature);
        display();
    }

    @Override
    public void display() {
        double max = temperatureHistory.stream().max(tempComparator).get();

        double min = temperatureHistory.stream().min(tempComparator).get();

        double average = temperatureHistory.stream().collect(Collectors.averagingDouble((p) -> p));
        System.out.println("Avg/Max/Min: " + average + "/" + max + "/" + min);
    }

    private Comparator<Double> tempComparator = (o1, o2) -> {
        if (o1.equals(o2)) {
            return 0;
        }

        return o1 < o2 ? -1 : 1;
    };
}
