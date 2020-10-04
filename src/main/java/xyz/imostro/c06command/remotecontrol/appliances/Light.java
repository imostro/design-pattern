package xyz.imostro.c06command.remotecontrol.appliances;

/**
 * @author Gray
 * @date 2020/9/30 12:50
 */
public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "light on");
    }

    public void off() {
        System.out.println(name + "light off");
    }
}
