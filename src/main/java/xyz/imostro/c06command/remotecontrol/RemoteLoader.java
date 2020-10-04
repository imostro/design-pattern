package xyz.imostro.c06command.remotecontrol;

import xyz.imostro.c06command.remotecontrol.appliances.CeilingFan;
import xyz.imostro.c06command.remotecontrol.appliances.GarageDoor;
import xyz.imostro.c06command.remotecontrol.appliances.Light;
import xyz.imostro.c06command.remotecontrol.appliances.Stereo;
import xyz.imostro.c06command.remotecontrol.command.*;

/**
 * @author Gray
 * @date 2020/9/30 16:51
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // 将所有的装置创建在合适的位置
        Light roomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan fan = new CeilingFan("Living Room");

        // 创建所有的电灯命令对象
        LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
        LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        // 创建吊扇开与关命令
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(fan);
        CeilingOffCommand ceilingOffCommand = new CeilingOffCommand(fan);

        // 创建车库门的上与下命令
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand doorDownCommand = new GarageDoorDownCommand(garageDoor);

        // 创建音响的开与关命令
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // 现在已经有了全部的命令，可以将它们加载到遥控器插槽中
        remoteControl.setCommands(0, roomLightOnCommand, roomLightOffCommand);
        remoteControl.setCommands(1, kitchenLightOnCommand, kitchenLightOnCommand);
        remoteControl.setCommands(2, ceilingFanOnCommand, ceilingOffCommand);
        remoteControl.setCommands(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);
        for (int i=0; i<7;i++){
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
    }
}
