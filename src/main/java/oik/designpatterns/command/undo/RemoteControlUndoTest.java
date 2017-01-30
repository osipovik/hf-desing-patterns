package oik.designpatterns.command.undo;

import oik.designpatterns.command.impl.ceiling.CeilingFanHighCommand;
import oik.designpatterns.command.impl.ceiling.CeilingFanMediumCommand;
import oik.designpatterns.command.impl.ceiling.CeilingFanOffCommand;
import oik.designpatterns.command.impl.light.LightOffCommand;
import oik.designpatterns.command.impl.light.LightOnCommand;
import oik.designpatterns.command.objects.CeilingFan;
import oik.designpatterns.command.objects.Light;
import oik.designpatterns.command.remote.RemoteControl;

public class RemoteControlUndoTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }
}
