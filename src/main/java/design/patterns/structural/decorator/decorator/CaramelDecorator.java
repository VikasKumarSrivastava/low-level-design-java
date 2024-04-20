package design.patterns.structural.decorator.decorator;

import design.patterns.structural.decorator.coffee.Coffee;

public class CaramelDecorator extends Decorator{
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return this.coffee.getCost()+ 1000;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription()+", Caramel";
    }
}
