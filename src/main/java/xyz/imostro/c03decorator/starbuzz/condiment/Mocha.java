package xyz.imostro.c03decorator.starbuzz.condiment;

import xyz.imostro.c03decorator.starbuzz.Beverage;

/**
 * 摩卡
 */
public class Mocha extends  CondimentDecorator{

    // 被装饰者
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        // 把被装饰者的价格+本身的价格
        return .20f + beverage.cost();
    }


}
