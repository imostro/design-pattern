package xyz.imostro.c08template.starbuzz;

/**
 * 过程：
 *  1. 把水煮沸
 *  2. 用沸水浸泡茶叶
 *  3. 把茶倒进杯子
 *  4. 加柠檬
 */
public class Tea {

    void prepareRecipe(){
        boilWater();
        // 2不同
        steepTeaBag();
        pourInCup();
        // 4不同
        addLemon();
    }
    private void addLemon() {
        System.out.println("Adding lemon");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
