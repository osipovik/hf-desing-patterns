package main.java.oik.designpatterns.strategy.models.impl;

import main.java.oik.designpatterns.strategy.behaviour.fly.impl.FlyWithWings;
import main.java.oik.designpatterns.strategy.behaviour.quack.impl.Quack;
import main.java.oik.designpatterns.strategy.models.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard models");
    }
}
