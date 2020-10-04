package xyz.imostro.c04factory.pizza.pizza;


import xyz.imostro.c04factory.pizza.pizza.ingredient.cheese.Cheese;
import xyz.imostro.c04factory.pizza.pizza.ingredient.clams.Clams;
import xyz.imostro.c04factory.pizza.pizza.ingredient.dough.Dough;
import xyz.imostro.c04factory.pizza.pizza.ingredient.pepperoni.Peperoni;
import xyz.imostro.c04factory.pizza.pizza.ingredient.sauce.Sauce;
import xyz.imostro.c04factory.pizza.pizza.ingredient.veggies.Veggies;

public abstract class Pizza {

    String name;

    Cheese cheese;

    Dough dough;

    Sauce sauce;   // 佐料

    Clams clams;

    Peperoni peperoni;

    Veggies[] veggies;

    // 现在把prepare()方法声明成抽象，在这个方法中，我们需要收集pizza所需的原理，而这些原料当然来自原料工厂
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes a 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
