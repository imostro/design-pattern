package xyz.imostro.c06command.remotecontrol;

import xyz.imostro.c06command.remotecontrol.command.Command;

/**
 * @author Gray
 * @date 2020/9/30 12:51
 */
public class SimpleRemoteControl {

    Command slot;       // 有一个插槽持有命令，而这个命令控制着一个装置

    public SimpleRemoteControl() {
    }

    // 这个方法用来设置插槽控制的命令。如果这段代码的客户想要改变遥控器按钮的行为，可以多次调用这个方法
    public void setSlot(Command slot) {
        this.slot = slot;
    }

    // 当按下按钮时，这个方法就会被调用，使得当前命令衔接插槽，并调用它的execute()方法。
    public void buttonWasPressed(){
        slot.execute();
    }
}
