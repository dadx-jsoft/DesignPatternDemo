package behavioral10.strategy.behavior.impl;

import behavioral10.strategy.behavior.FlyBehavior;

// Fly behavior implement.
public class FlyWithWings implements FlyBehavior {
    
    @Override
	public void fly() {
		System.out.println("Hura, tao có thể bay");
	}
}
