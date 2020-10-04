package xyz.imostro.c04factory.pizza.factory;

import xyz.imostro.c04factory.pizza.pizza.ingredient.cheese.Cheese;
import xyz.imostro.c04factory.pizza.pizza.ingredient.clams.Clams;
import xyz.imostro.c04factory.pizza.pizza.ingredient.dough.Dough;
import xyz.imostro.c04factory.pizza.pizza.ingredient.pepperoni.Peperoni;
import xyz.imostro.c04factory.pizza.pizza.ingredient.sauce.Sauce;
import xyz.imostro.c04factory.pizza.pizza.ingredient.veggies.Veggies;

/**
 *  该工厂不一定是接口，如果每个工厂实例内都有某一种通用的”机制“需要实现，则可以把它改成抽象类
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Peperoni createPepperoni();
    Clams createClam();
}
