package oik.designpatterns.command.impl.ceiling;

import oik.designpatterns.command.objects.CeilingFan;

public class CeilingFanLowCommand extends AbstractCeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
