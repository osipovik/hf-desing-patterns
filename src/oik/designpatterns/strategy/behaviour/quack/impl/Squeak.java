package oik.designpatterns.strategy.behaviour.quack.impl;

import oik.designpatterns.strategy.behaviour.quack.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
