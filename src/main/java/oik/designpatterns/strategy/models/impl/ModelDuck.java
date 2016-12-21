package main.java.oik.designpatterns.strategy.models.impl;

import main.java.oik.designpatterns.strategy.behaviour.fly.impl.FlyNoWay;
import main.java.oik.designpatterns.strategy.behaviour.quack.impl.Quack;
import main.java.oik.designpatterns.strategy.models.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model models");
    }
}
