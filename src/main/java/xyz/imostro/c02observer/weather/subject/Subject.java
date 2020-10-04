package xyz.imostro.c02observer.weather.subject;

import xyz.imostro.c02observer.weather.observer.Observer;

/**
 * 观察者模式中，主题接口提供的三个操作：注册、移除、通知 观察者
 */
public interface Subject {
    /*
        注册观察者
     */
    void registerObserver(Observer observer);

    /*
        移除观察者
     */
    void removeObserver(Observer observer);

    /*
        通知观察者
     */
    void notifyObserver();
}
