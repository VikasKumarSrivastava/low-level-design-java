package design.patterns.behavioral.mediator;

public interface Mediator {
    void addBid(Colleague colleague, int amount);
    void addBidder(Colleague colleague);
}
