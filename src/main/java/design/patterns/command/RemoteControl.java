package design.patterns.command;

import design.patterns.command.commands.ICommand;
import design.patterns.command.commands.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Slot> slots;
    private ICommand undoCommand;

    public RemoteControl() {
        this.slots = new ArrayList<>(7);
        for (int i = 0; i < 7; ++i) {
            slots.add(new Slot(new NoCommand(), new NoCommand()));
        }
        undoCommand = new NoCommand();
    }

    public void setSlot(int index, Slot slot) {
        this.slots.set(index, slot);
    }

    public void onButtonWasPushed(int index) {
        this.slots.get(index).getOnCommand().execute();
        undoCommand = slots.get(index).getOnCommand();
    }

    public void offButtonWasPushed(int index) {
        this.slots.get(index).getOffCommand().execute();
        undoCommand = slots.get(index).getOffCommand();
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
