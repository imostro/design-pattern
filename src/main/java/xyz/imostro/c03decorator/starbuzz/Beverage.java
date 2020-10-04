package xyz.imostro.c03decorator.starbuzz;

/**
 * 饮料抽象类
 *
 * 新任务：在饮料和调料的结构完成之后，当引入需求时，例如增加咖啡容量大小:tall、grande、ventis。
 *        怎么样做才能更好的完成该任务？（尽量不修改原来代码的基础上完成）
 */
public abstract class Beverage {

    public final static int TALL = 0;
    public final static int GRANDE = 1;
    public final static int VENTI = 2;

    String description = "Unknown Beverage";
    int size = 0;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract float cost();
}
