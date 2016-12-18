package oik.designpatterns.strategy.behaviour.fly.impl;

import oik.designpatterns.strategy.behaviour.fly.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
