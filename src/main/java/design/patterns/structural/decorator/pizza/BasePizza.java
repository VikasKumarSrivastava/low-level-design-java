package design.patterns.structural.decorator.pizza;

public class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Base pizza";
    }

    @Override
    public float getCost() {
        return 100.0f;
    }
}
