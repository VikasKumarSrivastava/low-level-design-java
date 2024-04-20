package design.patterns.structural.adapter.adapter;

import design.patterns.structural.adapter.Document;
import design.patterns.structural.adapter.RashanCard;

public class DocumentAdapter implements Document {
    private RashanCard rashanCard;

    public DocumentAdapter(RashanCard rashanCard) {
        this.rashanCard = rashanCard;
    }

    @Override
    public String getFirstName() {
        return this.rashanCard.getFullName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return this.rashanCard.getFullName().split(" ")[1];
    }

    @Override
    public int getAge() {
        return this.rashanCard.getAge();
    }
}
