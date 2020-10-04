package xyz.imostro.c03decorator.starbuzz;

/**
 * 首选组合
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public float cost() {
        return 0.89f;
    }
}
