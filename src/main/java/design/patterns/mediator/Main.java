package design.patterns.mediator;

public class Main {
    public static void main(String[] args) {
        AuctionManager auctionManager = new AuctionManager();
        Colleague anurag = new Bidder("1", auctionManager);
        Colleague shreehari = new Bidder("2", auctionManager);
        Colleague priya = new Bidder("3", auctionManager);
        auctionManager.addBidder(anurag);
        auctionManager.addBidder(shreehari);
        auctionManager.addBidder(priya);

        priya.placeBid(100);
    }
}
