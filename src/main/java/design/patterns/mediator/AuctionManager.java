package design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionManager implements Mediator{
    List<Colleague> colleagues;

    public AuctionManager() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addBid(Colleague colleague, int amount) {
        for(Colleague c: this.colleagues){
            // send notification, if c is not the one, who is placing the bid.
            if(!c.getId().equals(colleague.getId())){
                c.receiveNotification(colleague, amount);
            }
        }
    }

    @Override
    public void addBidder(Colleague colleague) {
        this.colleagues.add(colleague);
    }
}
