package design.patterns.structural.decorator.decorator;

import design.patterns.structural.decorator.coffee.Coffee;

public abstract class Decorator implements Coffee {
    protected Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
