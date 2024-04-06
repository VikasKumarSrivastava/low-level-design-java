package design.patterns.mediator;

public interface Mediator {
    void addBid(Colleague colleague, int amount);
    void addBidder(Colleague colleague);
}
