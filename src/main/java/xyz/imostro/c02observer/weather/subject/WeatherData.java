package xyz.imostro.c02observer.weather.subject;

import xyz.imostro.c02observer.weather.observer.Observer;

import java.util.HashSet;

public class WeatherData implements Subject {

    private float temperature;

    private float humidity;

    private float pressure;

    private HashSet<Observer> observers = new HashSet<Observer>();

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    /*
            一旦气象测量更新,此方法会被调用
         */
    public void measurementsChanged(){
        notifyObserver();
    }

    /*
        提供布告板的测试方法
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
