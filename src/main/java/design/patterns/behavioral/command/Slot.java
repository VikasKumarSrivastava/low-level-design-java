package design.patterns.behavioral.command;

import design.patterns.behavioral.command.commands.ICommand;

public class Slot {
    private ICommand onCommand, offCommand;

    public Slot(ICommand onCommand, ICommand offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public ICommand getOnCommand() {
        return onCommand;
    }

    public ICommand getOffCommand() {
        return offCommand;
    }
}
