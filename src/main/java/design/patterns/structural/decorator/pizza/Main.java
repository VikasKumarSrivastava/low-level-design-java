package design.patterns.structural.decorator.pizza;

import design.patterns.structural.decorator.pizza.decorator.CheeseDecorator;
import design.patterns.structural.decorator.pizza.decorator.PaneerDecorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        pizza = new PaneerDecorator(pizza);
        pizza = new CheeseDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
