package xyz.imostro.c04factory.pizza.pizza;

public class ChicagoStyleCheesePizza extends Pizza {


    @Override
    public void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
