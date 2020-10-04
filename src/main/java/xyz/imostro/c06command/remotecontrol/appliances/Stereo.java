package xyz.imostro.c06command.remotecontrol.appliances;

/**
 * @author Gray
 * @date 2020/9/30 16:48
 */
public class Stereo {

    String name;
    int volume;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name +"stereo on");
    }

    public void setCD() {
        System.out.println(name +"stereo set CD");
    }

    public void setVolume(int i) {
        volume = i;
        System.out.println(name +"stereo set Volume");
    }

    public void off(){
        volume = 0;
        System.out.println(name +"stereo off");
    }
}
