package oik.designpatterns.command.impl;

import oik.designpatterns.command.Command;

import java.util.List;

public class MacroCommand implements Command {
    List<Command> commandList;

    public MacroCommand(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        commandList.forEach(Command::execute);
    }

    @Override
    public void undo() {
        for (int i = commandList.size(); i > 0; i--) {
            commandList.get(i-1).undo();
        }
    }
}
