package design.patterns.mediator;

public class Bidder implements Colleague {
    private String name;
    private AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public void placeBid(int amount) {
        this.auctionMediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println(this.name + ": Notification for bid for-" + amount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
