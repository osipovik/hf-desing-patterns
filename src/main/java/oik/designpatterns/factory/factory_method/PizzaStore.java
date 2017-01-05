package oik.designpatterns.factory.factory_method;

import oik.designpatterns.factory.Pizza;

@SuppressWarnings("Duplicates")
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
