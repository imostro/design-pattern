package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.Light;

/**
 * @author Gray
 * @date 2020/9/30 16:46
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
