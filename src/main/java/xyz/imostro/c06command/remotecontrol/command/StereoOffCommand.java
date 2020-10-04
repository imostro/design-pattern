package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.Stereo;

/**
 * @author Gray
 * @date 2020/9/30 17:06
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
