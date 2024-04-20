package design.patterns.structural.decorator.coffee;

public class Latte implements Coffee {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Latte coffee";
    }
}
