package xyz.imostro.c03decorator.starbuzz;

/**
 * 无咖啡因咖啡
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public float cost() {
        return 1.1f;
    }
}
