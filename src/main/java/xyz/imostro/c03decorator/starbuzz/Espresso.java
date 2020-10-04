package xyz.imostro.c03decorator.starbuzz;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
