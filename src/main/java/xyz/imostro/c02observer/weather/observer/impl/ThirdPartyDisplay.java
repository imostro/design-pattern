package xyz.imostro.c02observer.weather.observer.impl;

import xyz.imostro.c02observer.weather.observer.DisplayElement;
import xyz.imostro.c02observer.weather.observer.Observer;

/**
 * 开发人员可以哦那个过实现观察者和现实接口来创建自己的布告板
 */
public class ThirdPartyDisplay implements DisplayElement, Observer {
    public void display() {
        
    }

    public void update(float temp, float humidity, float pressure) {

    }
}
