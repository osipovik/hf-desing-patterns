package oik.designpatterns.command.impl.light;

import oik.designpatterns.command.Command;
import oik.designpatterns.command.objects.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
