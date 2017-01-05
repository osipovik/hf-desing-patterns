package oik.designpatterns.factory.simple_factory;

import oik.designpatterns.factory.simple_factory.pizza.CheesePizza;
import oik.designpatterns.factory.simple_factory.pizza.ClamPizza;
import oik.designpatterns.factory.simple_factory.pizza.PepperoniPizza;
import oik.designpatterns.factory.simple_factory.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}