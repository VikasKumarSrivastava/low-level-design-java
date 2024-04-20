package design.patterns.structural.decorator;

import design.patterns.structural.decorator.coffee.Cappuccino;
import design.patterns.structural.decorator.coffee.Coffee;
import design.patterns.structural.decorator.decorator.MilkDecorator;
import design.patterns.structural.decorator.decorator.WhipDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Cappuccino();
        coffee = new MilkDecorator(coffee);
        coffee = new WhipDecorator(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }
}
