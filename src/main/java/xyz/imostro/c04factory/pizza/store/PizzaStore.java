package xyz.imostro.c04factory.pizza.store;

import xyz.imostro.c04factory.pizza.pizza.Pizza;
import xyz.imostro.c04factory.pizza.factory.SimplePizzaFactory;
import xyz.imostro.c04factory.pizza.pizza.PizzaConstant;

/**
 * 披萨店的抽象类，由其他的披萨店继承实现
 */
public abstract class PizzaStore {

//    SimplePizzaFactory factory;

    public PizzaStore() {
    }

    // 简单工厂
/*    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/

    final public Pizza orderPizza(PizzaConstant type){
        Pizza pizza;


        /*
        // 不使用 工厂的方式创建Pizza,可以看到,orderPizza方法无法做到修改关闭，并且Pizza的需求会不断的在变化，有旧的Pizza不再出售了，也有
        // 新的pizza出现
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        */

        // 通过简单工厂来创建pizza
//        pizza = factory.createPizzaFactory(type);

        pizza =  createPizza(type);

        //  Pizza对象是抽象的，OrderPizza并不知道哪些实际的具体类参与进来。（解耦）
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(PizzaConstant type);        // 创建怎样的披萨由具体的pizza店实现
}
