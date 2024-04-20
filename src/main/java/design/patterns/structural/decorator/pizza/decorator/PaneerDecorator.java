package design.patterns.structural.decorator.pizza.decorator;

import design.patterns.structural.decorator.pizza.Pizza;

public class PaneerDecorator extends Decorator {
    public PaneerDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Addon: Paneer";
    }

    @Override
    public float getCost() {
        return this.pizza.getCost() + 20;
    }
}
