package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.CeilingFan;

/**
 * @author Gray
 * @date 2020/9/30 17:00
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}
