package xyz.imostro.c05singleton.chocolate;

public class ChocolateBoiler {

    private static volatile ChocolateBoiler chocolateBoiler;


    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (chocolateBoiler == null){
            synchronized (ChocolateBoiler.class){
                if (chocolateBoiler == null){
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }

        return chocolateBoiler;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()){
            // 排除煮沸的巧克力和牛奶
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            // 将炉内物煮沸
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
