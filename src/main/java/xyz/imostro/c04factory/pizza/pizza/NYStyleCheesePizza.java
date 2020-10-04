package xyz.imostro.c04factory.pizza.pizza;

import xyz.imostro.c04factory.pizza.factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;


    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
