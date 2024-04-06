package design.patterns.command.commands.light;

public class Light {
    private String place;
    private String state;

    public Light(String place) {
        this.place = place;
        this.state = "off";
    }

    public void off() {
        this.state = "off";
    }

    public void on() {
        this.state = "on";
    }

    public String getPlace() {
        return place;
    }
}
