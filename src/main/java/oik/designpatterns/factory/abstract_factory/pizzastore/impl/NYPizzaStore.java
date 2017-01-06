package oik.designpatterns.factory.abstract_factory.pizzastore.impl;


import oik.designpatterns.factory.abstract_factory.PizzaIngredientFactory;
import oik.designpatterns.factory.abstract_factory.impl.NYPizzaIngredientFactory;
import oik.designpatterns.factory.abstract_factory.pizza.Pizza;
import oik.designpatterns.factory.abstract_factory.pizza.impl.CheesePizza;
import oik.designpatterns.factory.abstract_factory.pizza.impl.ClamPizza;
import oik.designpatterns.factory.abstract_factory.pizza.impl.PepperoniPizza;
import oik.designpatterns.factory.abstract_factory.pizza.impl.VeggiePizza;
import oik.designpatterns.factory.abstract_factory.pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York style cheese pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York style pepperoni pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York style clam pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York style veggie pizza");
        }

        return pizza;
    }
}
