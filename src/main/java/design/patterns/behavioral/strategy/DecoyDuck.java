package design.patterns.behavioral.strategy;

import design.patterns.behavioral.strategy.fly.FlyNoWay;
import design.patterns.behavioral.strategy.quack.Squeak;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {

    }
}
