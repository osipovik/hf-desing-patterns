package oik.designpatterns.command.macro;

import oik.designpatterns.command.Command;
import oik.designpatterns.command.impl.MacroCommand;
import oik.designpatterns.command.impl.ceiling.CeilingFanHighCommand;
import oik.designpatterns.command.impl.ceiling.CeilingFanOffCommand;
import oik.designpatterns.command.impl.light.LightOffCommand;
import oik.designpatterns.command.impl.light.LightOnCommand;
import oik.designpatterns.command.impl.stereo.StereoOffCommand;
import oik.designpatterns.command.impl.stereo.StereoOnWithCDCommand;
import oik.designpatterns.command.objects.CeilingFan;
import oik.designpatterns.command.objects.Light;
import oik.designpatterns.command.objects.Stereo;
import oik.designpatterns.command.remote.RemoteControl;

import java.util.Arrays;
import java.util.List;

public class MacroCommandTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("");
        Stereo stereo = new Stereo("");
        CeilingFan ceilingFan = new CeilingFan("");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingOnCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingOffCommand = new CeilingFanOffCommand(ceilingFan);

        List<Command> partyOn = Arrays.asList(lightOnCommand, stereoOnCommand, ceilingOnCommand);
        List<Command> partyOff = Arrays.asList(lightOffCommand, stereoOffCommand, ceilingOffCommand);

        MacroCommand macroCommandOn = new MacroCommand(partyOn);
        MacroCommand macroCommandOff = new MacroCommand(partyOff);

        remoteControl.setCommand(0, macroCommandOn, macroCommandOff);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPressed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPressed(0);

    }
}
