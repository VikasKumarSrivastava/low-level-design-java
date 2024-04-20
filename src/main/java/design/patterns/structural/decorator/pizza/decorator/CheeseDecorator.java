package design.patterns.structural.decorator.pizza.decorator;

import design.patterns.structural.decorator.pizza.Pizza;

public class CheeseDecorator extends Decorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Addon: Cheese";
    }

    @Override
    public float getCost() {
        return this.pizza.getCost() + 10;
    }
}
