package xyz.imostro.c06command.remotecontrol.command;

import xyz.imostro.c06command.remotecontrol.appliances.Stereo;

/**
 * @author Gray
 * @date 2020/9/30 16:48
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;   // 就如同LightOnCommand的做法一样，传入音响的实例，然后将其存储在局部实例变量中。
    }

    @Override
    public void execute() {
        /// 要实现这个请求，需要调用音响的三个方法：首先打开它，然后把它设置成播放CD，最后把音量设置为11.
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
