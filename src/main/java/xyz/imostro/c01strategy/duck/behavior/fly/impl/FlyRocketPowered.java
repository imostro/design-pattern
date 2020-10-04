package xyz.imostro.c01strategy.duck.behavior.fly.impl;

import xyz.imostro.c01strategy.duck.behavior.fly.FlyBehavior;

/**
 * 火箭动力飞行行为
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I`m flying with rocket");
    }
}
