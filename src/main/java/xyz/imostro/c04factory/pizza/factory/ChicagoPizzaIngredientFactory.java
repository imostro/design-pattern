package xyz.imostro.c04factory.pizza.factory;

import xyz.imostro.c04factory.pizza.pizza.ingredient.cheese.Cheese;
import xyz.imostro.c04factory.pizza.pizza.ingredient.cheese.MozzarellaCheese;
import xyz.imostro.c04factory.pizza.pizza.ingredient.clams.Clams;
import xyz.imostro.c04factory.pizza.pizza.ingredient.clams.FrozenClams;
import xyz.imostro.c04factory.pizza.pizza.ingredient.dough.Dough;
import xyz.imostro.c04factory.pizza.pizza.ingredient.dough.ThickCrustDough;
import xyz.imostro.c04factory.pizza.pizza.ingredient.pepperoni.Peperoni;
import xyz.imostro.c04factory.pizza.pizza.ingredient.pepperoni.SllcadPepperoni;
import xyz.imostro.c04factory.pizza.pizza.ingredient.sauce.PlumTomatoSauce;
import xyz.imostro.c04factory.pizza.pizza.ingredient.sauce.Sauce;
import xyz.imostro.c04factory.pizza.pizza.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Peperoni createPepperoni() {
        return new SllcadPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
