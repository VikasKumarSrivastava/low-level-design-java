package design.patterns.structural.decorator.decorator;

import design.patterns.structural.decorator.coffee.Coffee;

public class WhipDecorator extends Decorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return this.coffee.getCost()+ 100;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription()+ ", Whip";
    }
}
