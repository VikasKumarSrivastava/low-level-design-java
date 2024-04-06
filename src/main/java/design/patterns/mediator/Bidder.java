package design.patterns.mediator;

public class Bidder implements Colleague {
    private String id;
    private Mediator mediator;

    public Bidder(String id, Mediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void placeBid(int amount) {
        this.mediator.addBid(this, amount);
    }

    @Override
    public void receiveNotification(Colleague colleague, int amount) {
        System.out.println("Name: " + this.id + " :: " + colleague.getId() + "placed a bid of- " + amount);
    }
}
