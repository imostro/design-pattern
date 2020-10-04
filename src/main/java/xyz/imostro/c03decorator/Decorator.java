package xyz.imostro.c03decorator;


import xyz.imostro.c03decorator.starbuzz.Beverage;
import xyz.imostro.c03decorator.starbuzz.DarkRoast;
import xyz.imostro.c03decorator.starbuzz.Espresso;
import xyz.imostro.c03decorator.starbuzz.condiment.Mocha;
import xyz.imostro.c03decorator.starbuzz.condiment.Whip;

/**
 *
 *  装饰者模式：动态地将职责附加到对象上。若要扩展功能，装饰者提供比继承更有弹性的替代方案。
 *
 *  本章设计原则: 类应该对扩展开放，对修改关闭（开放扩展修改关闭原则）
 *
 *  装饰模式的做法（摩卡和奶泡深焙咖啡）
 *      1. 哪一个深焙咖啡(DarRoast)对象
 *      2. 以摩卡(Mocha)对象装饰它
 *      3. 以奶泡(Whip)对象装饰它
 *      4. 调用cost()方法，并依赖委托(delegate)将调料的价格加上去
 *
 *  装饰者模式的特点
 *      - 装饰者和被装饰者对象有相同的超类。
 *      - 你可以用一个或多个装饰者包装一个对象。
 *      - 既然装饰者和被装饰者对象有相同的超类型，所以在任何需要原始对象（被包装的）的场合，可以用装饰过的对象代替它。
 *      - 装饰者可以在所委托被装饰者的行为之前与/或之后，加上自己的行为，以达到特定的目的。（装饰者模式的重点）
 *      - 对象可以在任何时候被装饰，所以可以在运行时动态地、不限量地用你喜欢的装饰者来装饰对象。
 *
 *  java I/O中对装饰者模式的应用
 */
public class Decorator {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", $" + beverage.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

    }
}
