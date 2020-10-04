package xyz.imostro.c04factory.pizza.factory;

import xyz.imostro.c04factory.pizza.pizza.Pizza;

/**
 * 创建简单工厂，把Pizza的创建移到这里来创建，其他地方如果需要创建Pizza就直接从这里创建即可。
 * 优点：修改时只需修改工厂类即可，其他地方的类无需改动
 * 缺点: 还是需要大量的if-else语句来完成创建，并且没有修改关闭，代码会不断的膨胀或者修改容易出错
 *
 * 这种行为并不是工厂模式，因为这是在编码时为了方便修改常用的做法
 */
public class SimplePizzaFactory {

    public static Pizza createPizzaFactory(String type){
        return null;
    }
}
