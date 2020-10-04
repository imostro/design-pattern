package xyz.imostro.c02observer.weather.observer.impl;

import xyz.imostro.c02observer.weather.observer.DisplayElement;
import xyz.imostro.c02observer.weather.observer.Observer;
import xyz.imostro.c02observer.weather.subject.Subject;

/**
 * 根据气压计显示天气预报
 */
public class ForecastDisplay implements DisplayElement, Observer {

    private float pressure;

    private Subject subject;        // 保存主题的引用，方便订阅和取消订阅的操作

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("当前天气气压: " + pressure + "Pa");
    }

    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
