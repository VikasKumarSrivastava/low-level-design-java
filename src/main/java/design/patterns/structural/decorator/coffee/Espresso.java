package design.patterns.structural.decorator.coffee;

public class Espresso implements Coffee {
    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
