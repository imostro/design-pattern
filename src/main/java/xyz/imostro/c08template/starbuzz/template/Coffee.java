package xyz.imostro.c08template.starbuzz.template;

/**
 * @author Gray
 * @date 2020/10/4 14:36
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Driping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }
}
