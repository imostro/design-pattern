package xyz.imostro.c02observer.weather.observer;

public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
