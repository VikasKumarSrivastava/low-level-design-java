package design.patterns.behavioral.command.commands.light;

import design.patterns.behavioral.command.commands.ICommand;

public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off- " + light.getPlace());
        this.light.off();
    }

    @Override
    public void undo() {
        System.out.println("Undo Turned on light- " + light.getPlace());
        this.light.on();
    }
}
