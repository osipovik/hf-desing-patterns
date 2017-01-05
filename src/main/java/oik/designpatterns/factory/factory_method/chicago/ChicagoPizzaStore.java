package oik.designpatterns.factory.factory_method.chicago;

import oik.designpatterns.factory.Pizza;
import oik.designpatterns.factory.factory_method.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
