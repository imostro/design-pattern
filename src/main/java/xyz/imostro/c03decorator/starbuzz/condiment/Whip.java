package xyz.imostro.c03decorator.starbuzz.condiment;

import xyz.imostro.c03decorator.starbuzz.Beverage;

public class Whip extends CondimentDecorator{

    // 被装饰者
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public float cost() {
        return beverage.cost() + .30f;
    }
}
