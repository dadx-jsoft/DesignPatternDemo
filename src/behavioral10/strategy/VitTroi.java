package behavioral10.strategy;

import behavioral10.strategy.behavior.impl.FlyWithWings;
import behavioral10.strategy.behavior.impl.Quack;

// Vit troi class.
public class VitTroi extends Duck {
    // Constructor instance
    public VitTroi() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("VitTroi");
    }
}