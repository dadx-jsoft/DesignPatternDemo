package behavioral10.strategy;

import behavioral10.strategy.behavior.impl.FlyNoWay;
import behavioral10.strategy.behavior.impl.Mute;

// Vit nhua class.
public class VitNhua extends Duck {
    // Constructor instance
    public VitNhua() {
        quackBehavior = new Mute();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("VitNhua");
    }
}