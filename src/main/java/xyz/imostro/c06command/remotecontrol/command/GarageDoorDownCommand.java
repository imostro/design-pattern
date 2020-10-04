package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.GarageDoor;

/**
 * @author Gray
 * @date 2020/9/30 17:02
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
        door.stop();
        door.lightOff();
    }
}
