package behavioral10.strategy.behavior.impl;

import behavioral10.strategy.behavior.QuackBehavior;

public class Mute implements QuackBehavior {
    
    @Override
	public void quack() {
		System.out.println("Tao đéo kêu được");
	}
}