package design.patterns.structural.decorator.decorator;

import design.patterns.structural.decorator.coffee.Coffee;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return this.coffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Milk";
    }
}
