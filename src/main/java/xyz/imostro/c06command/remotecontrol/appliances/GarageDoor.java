package xyz.imostro.c06command.remotecontrol.appliances;

/**
 * @author Gray
 * @date 2020/9/30 12:55
 */
public class GarageDoor {

    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up(){
        System.out.println(name +"garage door up");
    }

    public void down(){
        System.out.println(name +"garage door down");
    }

    public void stop(){
        System.out.println(name +"garage door stop");
    }

    public void lightOn(){
        System.out.println(name +"garage door light on");
    }

    public void lightOff(){
        System.out.println(name +"garage door light off");
    }
}
