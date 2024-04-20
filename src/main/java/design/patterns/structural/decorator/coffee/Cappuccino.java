package design.patterns.structural.decorator.coffee;

public class Cappuccino implements Coffee {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Cappuccino coffee";
    }
}
