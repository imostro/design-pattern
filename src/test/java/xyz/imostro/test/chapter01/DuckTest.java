package xyz.imostro.test.chapter01;

import org.junit.jupiter.api.Test;
import xyz.imostro.c01strategy.duck.behavior.fly.impl.FlyRocketPowered;
import xyz.imostro.c01strategy.duck.entity.MallardDuck;
import xyz.imostro.c01strategy.duck.entity.ModelDuck;

public class DuckTest {

    @Test
    public void miniDuckSimulator(){
        MallardDuck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();


        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());       // 运行时改变鸭子的飞行能力
        modelDuck.performFly();
    }

}
