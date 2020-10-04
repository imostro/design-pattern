package xyz.imostro.c08template.starbuzz;

/**
 * 过程：
 *  1. 把水煮沸
 *  2. 用沸水冲泡咖啡
 *  3. 把咖啡倒进杯子
 *  4. 加糖和牛奶
 */
public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /*
        这里每个方法都实现了算法中的一个步骤：煮沸水、冲泡咖啡、把咖啡倒进杯子、加糖和奶
     */
    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
