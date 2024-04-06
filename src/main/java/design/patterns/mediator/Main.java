package design.patterns.mediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator=new Auction();
        Bidder bidder1=new Bidder("Sahil",auctionMediator);
        Bidder bidder2=new Bidder("Sanjit",auctionMediator);

        bidder1.placeBid(10);
        bidder2.placeBid(20);
    }
}
