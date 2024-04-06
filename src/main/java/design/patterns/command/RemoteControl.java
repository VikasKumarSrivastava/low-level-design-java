package design.patterns.command;

import design.patterns.command.commands.ICommand;
import design.patterns.command.commands.NoCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteControl {
    private List<Slot> slots;
    private Stack<ICommand> commandHistory;

    public RemoteControl() {
        this.slots = new ArrayList<>(7);
        for (int i = 0; i < 7; ++i) {
            slots.add(new Slot(new NoCommand(), new NoCommand()));
        }
        this.commandHistory = new Stack<>();
    }

    public void setSlot(int index, Slot slot) {
        this.slots.set(index, slot);
    }

    public void onButtonWasPushed(int index) {
        this.slots.get(index).getOnCommand().execute();
        this.commandHistory.add(slots.get(index).getOnCommand());
    }

    public void offButtonWasPushed(int index) {
        this.slots.get(index).getOffCommand().execute();
        this.commandHistory.add(slots.get(index).getOffCommand());
    }

    public void undoButtonWasPushed() {
        if (commandHistory.isEmpty()) {
            System.out.println("No command have been executed so far, so undo can be performed");
        }
        ICommand lastCommand = commandHistory.pop();
        lastCommand.undo();
    }
}
