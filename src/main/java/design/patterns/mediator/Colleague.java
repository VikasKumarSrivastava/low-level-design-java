package design.patterns.mediator;

public interface Colleague {
    String getId();
    void placeBid(int amount);
    void receiveNotification(Colleague colleague, int amount);
}
