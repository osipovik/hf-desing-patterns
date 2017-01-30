package oik.designpatterns.command.remote;

import oik.designpatterns.command.Command;
import oik.designpatterns.command.impl.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    List<Command> onCommandList;
    List<Command> offCommandList;
    Command lastCommand;

    public RemoteControl() {
        onCommandList = new ArrayList<>(7);
        offCommandList = new ArrayList<>(7);

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommandList.add(noCommand);
            offCommandList.add(noCommand);
        }

        lastCommand = noCommand;

//        onCommandList.forEach(command -> command = noCommand);
//        offCommandList.forEach(command -> command = noCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommandList.set(slot, onCommand);
        offCommandList.set(slot, offCommand);
    }

    public void onButtonWasPressed(int slot) {
        onCommandList.get(slot).execute();
        lastCommand = onCommandList.get(slot);
    }

    public void offButtonWasPressed(int slot) {
        offCommandList.get(slot).execute();
        lastCommand = offCommandList.get(slot);
    }

    public void undoButtonWasPressed() {
        lastCommand.undo();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------ Remote Control -------\n");

        for (int i = 0; i < onCommandList.size(); i++) {
            buffer.append("[slot " + i + "] " + onCommandList.get(i).getClass().getName()
                    + "    " + offCommandList.get(i).getClass().getName() + "\n");
        }

        return buffer.toString();
    }
}
