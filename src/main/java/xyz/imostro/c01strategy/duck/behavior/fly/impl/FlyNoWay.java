package xyz.imostro.c01strategy.duck.behavior.fly.impl;

import xyz.imostro.c01strategy.duck.behavior.fly.FlyBehavior;

/**
 * 这里是真正的行为实现，不同的鸭子可以根据自己自身的需求引入不同的实现
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("我不会飞");
    }
}
