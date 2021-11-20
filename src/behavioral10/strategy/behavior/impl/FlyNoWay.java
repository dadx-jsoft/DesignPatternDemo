package behavioral10.strategy.behavior.impl;

import behavioral10.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
		System.out.println("ĐM, tao đéo bay được");
	}
}