package xyz.imostro.c01strategy.duck.behavior.quack;

import xyz.imostro.c01strategy.duck.behavior.fly.FlyBehavior;

/**
 * 抽离鸭子易变的行为，
 * 详细参见
 * @see FlyBehavior
 */
public interface Quackable {

    void quack();
}
