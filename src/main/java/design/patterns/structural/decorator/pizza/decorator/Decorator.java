package design.patterns.structural.decorator.pizza.decorator;

import design.patterns.structural.decorator.pizza.Pizza;


public abstract class Decorator implements Pizza{
    protected Pizza pizza;

    public Decorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
