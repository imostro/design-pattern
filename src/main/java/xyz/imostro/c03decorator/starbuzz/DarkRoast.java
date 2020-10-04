package xyz.imostro.c03decorator.starbuzz;

public class DarkRoast extends Beverage {


    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public float cost() {
        return 0.95f;
    }
}
