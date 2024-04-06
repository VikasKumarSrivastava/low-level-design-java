package design.patterns.mediator;

public interface Colleague {
    void placeBid(int amount);
    void receiveBidNotification(int amount);
    String getName();
}
