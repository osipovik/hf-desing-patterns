package oik.designpatterns.strategy.models.impl;

import oik.designpatterns.strategy.behaviour.fly.impl.FlyNoWay;
import oik.designpatterns.strategy.behaviour.quack.impl.Quack;
import oik.designpatterns.strategy.models.Duck;

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
