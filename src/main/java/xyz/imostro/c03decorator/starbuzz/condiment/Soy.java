package xyz.imostro.c03decorator.starbuzz.condiment;

import xyz.imostro.c03decorator.starbuzz.Beverage;

/**
 * 豆浆
 */
public class Soy extends CondimentDecorator {

    // 被装饰者
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getSize(){
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        float cost = beverage.cost();
        if (getSize() == Beverage.TALL) cost += .10f;
        else if (getSize() == Beverage.GRANDE) cost += .15f;
        else if (getSize() == Beverage.VENTI) cost += .20f;
        return cost;
    }


}
