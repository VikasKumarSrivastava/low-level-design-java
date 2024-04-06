package design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    private List<Colleague> colleagues;

    public Auction() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague bidder) {
        this.colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {
        for(Colleague colleague: colleagues){
            if(colleague.getName()!=bidder.getName()){
                colleague.receiveBidNotification(amount);
            }
        }
    }
}
