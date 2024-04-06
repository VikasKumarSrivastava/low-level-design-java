package design.patterns.command.commands.light;

import design.patterns.command.commands.ICommand;

public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning on- " + light.getName());
        light.on();
    }

    @Override
    public void undo() {
        System.out.println("Turning off- " + light.getName());
        this.light.off();
    }
}