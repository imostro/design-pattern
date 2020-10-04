package xyz.imostro.c01strategy.duck.entity;

import xyz.imostro.c01strategy.duck.behavior.fly.impl.FlyWithWings;
import xyz.imostro.c01strategy.duck.behavior.quack.impl.Quack;

/**
 * 绿头鸭
 * 特殊行为：fly、quack
 *
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // 现在这里也属于面向实现编程，我们直接把实现类赋值进去了
        // 委托给相应的实现去做，到运行时调用perform*方法后会根据实现不同而出现不同行为
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是MallardDuck");
    }
}
