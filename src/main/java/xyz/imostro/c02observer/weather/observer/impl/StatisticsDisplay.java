package xyz.imostro.c02observer.weather.observer.impl;

import xyz.imostro.c02observer.weather.observer.DisplayElement;
import xyz.imostro.c02observer.weather.observer.Observer;
import xyz.imostro.c02observer.weather.subject.Subject;

/**
 * 跟踪最小、平均、最大的观测值，并显示它们
 */
public class StatisticsDisplay implements DisplayElement, Observer {

    private float[] temp = new float[3];

    private float[] humidity = new float[3];

    private float[] pressure = new float[3];

    private Subject subject;        // 保存主题的引用，方便订阅和取消订阅的操作

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("当前温度状态： 温度最小值：" + temp[0] +"F, 温度最大值： " +temp[1] + "F, 温度平均值： " + temp[2] + "F");
        System.out.println("当前湿度状态： 湿度最小值：" + humidity[0] +"%, 湿度最大值： " +humidity[1] + "%， 湿度平均值： " + humidity[2] + "%");
        System.out.println("当前气压状态： 气压最小值：" + pressure[0] +"Pa, 气压最大值： " +pressure[1] + "Pa, 气压平均值： " + pressure[2]  + "Pa");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp[0] = Math.min(temp ,this.temp[0]);
        this.temp[1] = Math.max(temp ,this.temp[1]);
        this.temp[2] = (this.temp[0] + this.temp[1]) /2;        //   为了方便，只用最大值和最小值计算平均值

        this.humidity[0] = Math.min(temp ,this.humidity[0]);
        this.humidity[1] = Math.max(temp ,this.humidity[1]);
        this.humidity[2] = (this.humidity[0] + this.humidity[1]) /2;

        this.pressure[0] = Math.min(temp ,this.pressure[0]);
        this.pressure[1] = Math.max(temp ,this.pressure[1]);
        this.pressure[2] = (this.pressure[0] + this.pressure[1]) /2;
        display();
    }
}
