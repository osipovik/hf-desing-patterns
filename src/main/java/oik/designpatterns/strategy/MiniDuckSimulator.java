package main.java.oik.designpatterns.strategy;

import main.java.oik.designpatterns.strategy.behaviour.fly.impl.FlyRocketPowered;
import main.java.oik.designpatterns.strategy.models.Duck;
import main.java.oik.designpatterns.strategy.models.impl.MallardDuck;
import main.java.oik.designpatterns.strategy.models.impl.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
