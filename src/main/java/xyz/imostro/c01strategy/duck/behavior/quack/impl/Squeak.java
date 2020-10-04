package xyz.imostro.c01strategy.duck.behavior.quack.impl;

import xyz.imostro.c01strategy.duck.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱叫");
    }
}
