package oik.designpatterns.command.remote;

import oik.designpatterns.command.impl.ceiling.CeilingFanOffCommand;
import oik.designpatterns.command.impl.ceiling.CeilingFanLowCommand;
import oik.designpatterns.command.impl.garage.GarageDoorCloseCommand;
import oik.designpatterns.command.impl.garage.GarageDoorOpenCommand;
import oik.designpatterns.command.impl.light.LightOffCommand;
import oik.designpatterns.command.impl.light.LightOnCommand;
import oik.designpatterns.command.impl.stereo.StereoOffCommand;
import oik.designpatterns.command.impl.stereo.StereoOnWithCDCommand;
import oik.designpatterns.command.objects.CeilingFan;
import oik.designpatterns.command.objects.GarageDoor;
import oik.designpatterns.command.objects.Light;
import oik.designpatterns.command.objects.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");
        CeilingFan ceilingFan = new CeilingFan("");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livignRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livignRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanLowCommand ceilingFanOn = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        control.setCommand(0, livignRoomLightOnCommand, livignRoomLightOffCommand);
        control.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        control.setCommand(2, ceilingFanOn, ceilingFanOff);
        control.setCommand(3, garageDoorOpen, garageDoorClose);
        control.setCommand(4, stereoOn, stereoOff);

        System.out.println(control.toString());

        control.onButtonWasPressed(0);
        control.offButtonWasPressed(0);
        control.onButtonWasPressed(1);
        control.offButtonWasPressed(1);
        control.onButtonWasPressed(2);
        control.offButtonWasPressed(2);
        control.onButtonWasPressed(3);
        control.offButtonWasPressed(3);
        control.onButtonWasPressed(4);
        control.offButtonWasPressed(4);
    }
}
