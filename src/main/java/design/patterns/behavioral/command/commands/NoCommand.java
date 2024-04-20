package design.patterns.behavioral.command.commands;

public class NoCommand implements ICommand{
    public NoCommand() {
    }

    @Override
    public void execute() {
        System.out.println("No command is set for this slot");
    }

    @Override
    public void undo() {
        System.out.println("No command is set for this slot");
    }
}
