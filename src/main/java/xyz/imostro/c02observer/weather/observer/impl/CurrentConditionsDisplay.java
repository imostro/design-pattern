package xyz.imostro.c02observer.weather.observer.impl;

import xyz.imostro.c02observer.weather.observer.DisplayElement;
import xyz.imostro.c02observer.weather.observer.Observer;
import xyz.imostro.c02observer.weather.subject.Subject;

/**
 * 显示当前观察值
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;

    private float humidity;

    private Subject subject;        // 保存主题的引用，方便订阅和取消订阅的操作

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("当前的天气状态: " + temperature + "摄氏度, 湿度" + humidity + "%");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature =temp;
        this.humidity = humidity;
        display();
    }
}
