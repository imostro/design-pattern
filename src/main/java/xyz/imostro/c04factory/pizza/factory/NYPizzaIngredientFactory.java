package xyz.imostro.c04factory.pizza.factory;

import xyz.imostro.c04factory.pizza.pizza.ingredient.cheese.Cheese;
import xyz.imostro.c04factory.pizza.pizza.ingredient.cheese.ReggianoCheese;
import xyz.imostro.c04factory.pizza.pizza.ingredient.clams.Clams;
import xyz.imostro.c04factory.pizza.pizza.ingredient.clams.FreshClams;
import xyz.imostro.c04factory.pizza.pizza.ingredient.dough.Dough;
import xyz.imostro.c04factory.pizza.pizza.ingredient.dough.ThinCrustDough;
import xyz.imostro.c04factory.pizza.pizza.ingredient.pepperoni.Peperoni;
import xyz.imostro.c04factory.pizza.pizza.ingredient.pepperoni.SlicedPepperoni;
import xyz.imostro.c04factory.pizza.pizza.ingredient.sauce.MarinaraSauce;
import xyz.imostro.c04factory.pizza.pizza.ingredient.sauce.Sauce;
import xyz.imostro.c04factory.pizza.pizza.ingredient.veggies.*;

/**
 * 纽约pizza店的原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Peperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
