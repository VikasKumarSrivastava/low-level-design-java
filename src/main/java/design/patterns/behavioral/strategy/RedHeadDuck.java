package design.patterns.behavioral.strategy;

import design.patterns.behavioral.strategy.fly.FlyWithWings;
import design.patterns.behavioral.strategy.quack.MuteQuack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Red head duck");
    }
}
