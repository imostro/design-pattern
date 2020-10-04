package xyz.imostro.c01strategy.duck.entity;

import xyz.imostro.c01strategy.duck.behavior.fly.FlyBehavior;
import xyz.imostro.c01strategy.duck.behavior.fly.impl.FlyNoWay;
import xyz.imostro.c01strategy.duck.behavior.quack.QuackBehavior;
import xyz.imostro.c01strategy.duck.behavior.quack.impl.MuteQuack;

/**
 * 鸭子的通用抽象类
 *
 *
 * 虽然有通用的状态和行为，但是不同的鸭子行为也不一样，例如有些鸭子会飞，但是有些不会；有些鸭子不会叫。那么对这些非通用行为有什么解法不呢？
 *
 * 方案一：
 * 该鸭子有两个特殊行为是其他鸭子所不具有的，一开始设计我们可能想直接在父类鸭子类中提供这种行为，但是出现要各处改动的问题
 *
 * 方案二：
 * 另一种办法，我们把这些行为抽离出来做成独立的接口，然后有该鸭子实现。但是这种做法也不是一种明智的选择。
 * 虽然不是所有的鸭子都具备这种行为，但是也会有大量鸭子会飞会叫，例如有100个鸭子实现类，其中有80个会飞的，70个会叫的，那么我们就需要重复这些过程。
 * 这样做显然不是一种很好的做法，因为重复的工作太多了，代码也无法复用
 *
 * 那么有没有一种办法可以对代码影响最小的方式来修改软件呢，可以花更少的时间来重做代码。
 * 需要知道，软件都是一直在变的，需求需要不断的改，不然软件很可能就会死亡
 *
 *      ****** 一个重要的设计原则：找出应用中可能需要变化之处，把它们独立出来，不要和那些需要变化的代码混在一起。        重点
 *
 *
 * IS-A 与 HAS-A
 * IS-A：子类继承Duck
 * HAS-A：Fly 和 Quack （这是一种策略模式的体现，可以根据不同的鸭子采用不同的行为策略）
 *
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
 *
 * 第三个设计原则：多用组合，少用继承
 */
public abstract class Duck {


    /*
        行为变量被声明为行为接口
     */
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
        // 默认实现，可以让一些没有这些行为的鸭子不用手动注入
        this(null, null);
    }

    public Duck(FlyBehavior flyBehavior) {
        this(flyBehavior, null);
    }

    public Duck(QuackBehavior quackBehavior) {
        this(null, quackBehavior);
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior == null ? new FlyNoWay() : flyBehavior;
        this.quackBehavior = quackBehavior == null ? new MuteQuack(): quackBehavior;
    }

    /*
                        取代之前的quack和fly
                     */
    public void performQuack(){
        quackBehavior.quack();      // 委托给行为类去实现
    }

    public void performFly() {
        flyBehavior.fly();
    }

    /*
        大家都会有的行为，对该行为进行抽象，由其子类去实现（像模板方法模式）
     */
    public abstract void display();

    public void swim(){
        System.out.println("所有鸭子都会游水");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    /*
        该方法为在新需求到来的时候添加进来的，因为有的鸭子它会飞
        但是这样很容易发现会出现一个严重的问题：并不是所有鸭子都是会飞的，并且因为在这之前有很多子类实现了该父类，
        如果直接在这添加一个方法的话，那么其他已经完成的子类也有跟着去修改实现该方法，当这种做法是不必要的，且会造成维护上的困难（该一处全都要改）
     */
//    public abstract void fly();

//    public abstract void quack();

}
