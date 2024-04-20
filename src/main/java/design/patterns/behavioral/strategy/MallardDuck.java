package design.patterns.behavioral.strategy;

import design.patterns.behavioral.strategy.fly.FlyWithWings;
import design.patterns.behavioral.strategy.quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
