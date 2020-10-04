package xyz.imostro.c06command.remotecontrol.appliances;

/**
 * @author Gray
 * @date 2020/9/30 16:54
 */
public class CeilingFan {

    public static final  int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String name;
    int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }


    public void on(){
        System.out.println(name + "ceiling fan on");
    }

    public void off(){
        speed = OFF;
        System.out.println(name + "ceiling fan off");
    }
}
