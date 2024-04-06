package design.patterns.command;

import design.patterns.command.commands.light.Light;
import design.patterns.command.commands.light.LightOffCommand;
import design.patterns.command.commands.light.LightOnCommand;
import design.patterns.command.commands.stereo.Stereo;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("living room light");
        LightOffCommand lightOffCommand=new LightOffCommand(livingRoomLight);
        LightOnCommand lightOnCommand =new LightOnCommand(livingRoomLight);
        remoteControl.setSlot(0, new Slot(lightOnCommand, lightOffCommand));
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}

