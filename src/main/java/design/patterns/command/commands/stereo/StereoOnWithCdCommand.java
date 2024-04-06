package design.patterns.command.commands.stereo;

import design.patterns.command.commands.ICommand;

public class StereoOnWithCdCommand implements ICommand {
    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolume();
    }

    @Override
    public void undo() {

    }
}
