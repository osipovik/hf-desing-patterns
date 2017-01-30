package oik.designpatterns.command.impl.ceiling;

import oik.designpatterns.command.objects.CeilingFan;

public class CeilingFanMediumCommand extends AbstractCeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
}
