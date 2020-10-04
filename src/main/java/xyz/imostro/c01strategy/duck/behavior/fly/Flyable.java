package xyz.imostro.c01strategy.duck.behavior.fly;

/**
 * 抽离鸭子易变的行为，让有改行为的鸭子去实现
 * 但是这并不是一种明智的做法，因为重复的代码太多了。因为很可能不同的鸭子飞行的方式是同样的
 */
public interface Flyable {

    void fly();
}
