package xyz.imostro.c01strategy.duck.entity;

import xyz.imostro.c01strategy.duck.behavior.quack.impl.Quack;

/**
 * 模型鸭
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new Quack()); // 不会飞，但会叫
    }

    public void display() {
        System.out.println("我是 Model Duck");
    }
}
