package design.patterns.behavioral.strategy.quack;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
