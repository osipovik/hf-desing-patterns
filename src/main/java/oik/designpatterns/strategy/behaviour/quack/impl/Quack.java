package main.java.oik.designpatterns.strategy.behaviour.quack.impl;

import main.java.oik.designpatterns.strategy.behaviour.quack.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
