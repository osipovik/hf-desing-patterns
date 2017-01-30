package oik.designpatterns.command.simpleremote;

import oik.designpatterns.command.impl.garage.GarageDoorOpenCommand;
import oik.designpatterns.command.impl.light.LightOnCommand;
import oik.designpatterns.command.objects.GarageDoor;
import oik.designpatterns.command.objects.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor door = new GarageDoor("");
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);

        control.setSlot(lightOn);
        control.buttonWasPressed();
        control.setSlot(doorOpen);
        control.buttonWasPressed();
    }
}
