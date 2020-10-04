package xyz.imostro.c03decorator.starbuzz.condiment;

import xyz.imostro.c03decorator.starbuzz.Beverage;

public class Milk extends CondimentDecorator {

    // 被装饰者
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + .15f;
    }
}
