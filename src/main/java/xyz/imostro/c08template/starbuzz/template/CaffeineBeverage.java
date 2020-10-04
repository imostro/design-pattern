package xyz.imostro.c08template.starbuzz.template;

/**
 * @author Gray
 * @date 2020/10/4 14:30
 */
public abstract class CaffeineBeverage {

    // 使用final修饰，不希望该类被子类覆盖
    final void prepareRecipe(){
        // 一个咖啡或茶的冲泡流程，子类不需要去实现，而是在父类中抽取成模板方法，子类只需实现它们在这个过程中不同的部分即可。
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 对于做法不同的方法进行抽象
    abstract void brew();

    abstract void addCondiments();


    // 对于相同的代码进行抽取实现
    final void boilWater(){
        System.out.println("Boiling water");
    }

    final void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
