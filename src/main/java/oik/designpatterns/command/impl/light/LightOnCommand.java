package oik.designpatterns.command.impl.light;

import oik.designpatterns.command.Command;
import oik.designpatterns.command.objects.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
