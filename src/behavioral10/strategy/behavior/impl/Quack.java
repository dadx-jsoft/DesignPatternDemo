package behavioral10.strategy.behavior.impl;

import behavioral10.strategy.behavior.QuackBehavior;

// Quack behavior implement.
public class Quack implements QuackBehavior {
    
    @Override
	public void quack() {
		System.out.println("Tao kêu được");
	}
}
