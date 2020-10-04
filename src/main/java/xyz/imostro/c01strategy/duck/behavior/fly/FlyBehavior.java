package xyz.imostro.c01strategy.duck.behavior.fly;

/**
 *  飞行的接口可以提前引入到Duck类中，让Duck依赖该接口，但是具体的实现只有在运行时才知道。
 *  这样可以充分利用多态性。
 *
 *  这样做的好处：
 *      1. 这个行为可以被其他类所复用，而无需重复实现
 *      2. 新增行为不会影响到其他已经使用了飞行行为的类，我们只需要重新创建一个类实现该接口即可（策略模式）
 *
 *  体现了一个重要的设计原则：针对接口编程，而不是针对实现编程
 *
 *
 */
public interface FlyBehavior {

    void fly();
}
