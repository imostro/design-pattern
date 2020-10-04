package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.GarageDoor;

/**
 * @author Gray
 * @date 2020/9/30 12:56
 */
public class GarageDoorOpenCommand implements Command{

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
        door.lightOn();
        door.stop();
    }
}
