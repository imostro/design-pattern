package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.Light;

/**
 * @author Gray
 * @date 2020/9/30 12:49
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    public void undo(){
        light.off();
    }
}
