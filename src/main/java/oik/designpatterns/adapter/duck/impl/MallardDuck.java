package oik.designpatterns.adapter.duck.impl;

import oik.designpatterns.adapter.duck.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
