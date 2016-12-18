package oik.designpatterns.strategy;

import oik.designpatterns.strategy.behaviour.fly.impl.FlyRocketPowered;
import oik.designpatterns.strategy.models.Duck;
import oik.designpatterns.strategy.models.impl.MallardDuck;
import oik.designpatterns.strategy.models.impl.ModelDuck;

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
