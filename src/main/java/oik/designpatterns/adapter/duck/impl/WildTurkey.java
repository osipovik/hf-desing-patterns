package oik.designpatterns.adapter.duck.impl;

import oik.designpatterns.adapter.duck.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm a flying a short distance");
    }
}
