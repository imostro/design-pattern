package xyz.imostro.c03decorator.starbuzz.condiment;

import xyz.imostro.c03decorator.starbuzz.Beverage;

/**
 * 调味品装饰者
 *
 * 装饰者继承Beverage类的目的不是为了使用该类的行为，而是为了有正确的类型
 */
public abstract class CondimentDecorator extends Beverage {

    /*
        所有的调料装饰者都必须重新实现getDescription方法
     */
    public abstract String getDescription();

    public abstract float cost();

}
