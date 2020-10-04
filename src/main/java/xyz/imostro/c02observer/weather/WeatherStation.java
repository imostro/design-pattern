package xyz.imostro.c02observer.weather;


import xyz.imostro.c02observer.weather.observer.Observer;
import xyz.imostro.c02observer.weather.observer.impl.CurrentConditionsDisplay;
import xyz.imostro.c02observer.weather.observer.impl.ForecastDisplay;
import xyz.imostro.c02observer.weather.observer.impl.HeatIndexDisplay;
import xyz.imostro.c02observer.weather.observer.impl.StatisticsDisplay;
import xyz.imostro.c02observer.weather.subject.WeatherData;

/**
 * Weather入口
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
