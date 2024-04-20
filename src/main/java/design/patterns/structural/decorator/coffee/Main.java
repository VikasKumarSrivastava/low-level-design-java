package design.patterns.structural.decorator.coffee;

import design.patterns.structural.decorator.coffee.decorator.MilkDecorator;
import design.patterns.structural.decorator.coffee.decorator.WhipDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Cappuccino();
        coffee = new MilkDecorator(coffee);
        coffee = new WhipDecorator(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }
}
