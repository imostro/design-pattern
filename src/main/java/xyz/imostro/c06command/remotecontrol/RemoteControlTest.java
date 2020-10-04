package xyz.imostro.c06command.remotecontrol;

import xyz.imostro.c06command.remotecontrol.appliances.Light;
import xyz.imostro.c06command.remotecontrol.command.LightOnCommand;

/**
 * @author Gray
 * @date 2020/9/30 12:54
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setSlot(new LightOnCommand(new Light("")));
        control.buttonWasPressed();
    }
}
