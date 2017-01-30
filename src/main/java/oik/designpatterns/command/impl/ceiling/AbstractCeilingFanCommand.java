package oik.designpatterns.command.impl.ceiling;

import oik.designpatterns.command.Command;
import oik.designpatterns.command.objects.CeilingFan;

public abstract class AbstractCeilingFanCommand implements Command {
    protected CeilingFan ceilingFan;
    protected int prevSpeed;

    public AbstractCeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
