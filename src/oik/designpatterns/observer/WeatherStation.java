package oik.designpatterns.observer;

import oik.designpatterns.observer.models.observer.impl.CurrentConditionsDisplay;
import oik.designpatterns.observer.models.observer.impl.ForecastDisplay;
import oik.designpatterns.observer.models.observer.impl.StatisticDisplay;
import oik.designpatterns.observer.models.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 75, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
