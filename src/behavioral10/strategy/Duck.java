package behavioral10.strategy;

import behavioral10.strategy.behavior.FlyBehavior;
import behavioral10.strategy.behavior.QuackBehavior;

// Fly behavior implement.
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // Con nào cũng hiển thị
    abstract void display();

    public Duck() {
    };

    // Fly
    public void performFly() {
        flyBehavior.fly();
    }

    // Quack
    public void performQuack() {
        quackBehavior.quack();
    }
}