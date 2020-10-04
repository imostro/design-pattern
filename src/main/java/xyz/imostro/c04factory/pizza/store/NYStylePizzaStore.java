package xyz.imostro.c04factory.pizza.store;

import xyz.imostro.c04factory.pizza.factory.NYPizzaIngredientFactory;
import xyz.imostro.c04factory.pizza.factory.PizzaIngredientFactory;
import xyz.imostro.c04factory.pizza.pizza.*;

public class NYStylePizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(PizzaConstant type) {

        // 工厂方法模式对接口的实现
        // 但是还是有个致命的问题，因为它依赖了具体实现，违反了依赖倒置的原则
/*        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;*/

        // 依赖倒置的设计
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type){
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case VEGGIE:
                pizza =new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }

        return pizza;
    }
}
