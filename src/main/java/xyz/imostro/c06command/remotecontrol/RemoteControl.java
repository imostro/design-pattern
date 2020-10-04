package xyz.imostro.c06command.remotecontrol;

import xyz.imostro.c06command.remotecontrol.command.Command;
import xyz.imostro.c06command.remotecontrol.command.NoCommand;

import java.util.Arrays;

/**
 * @author Gray
 * @date 2020/9/30 16:40
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommands = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommands;
            offCommands[i] = noCommands;
        }
    }

    // 设置相关的命令
    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=========Remote Control =============\n");
        for (int i=0; i<onCommands.length; i++){
            sb.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("   ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
