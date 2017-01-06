package oik.designpatterns.factory.abstract_factory.pizza.impl;

import oik.designpatterns.factory.abstract_factory.PizzaIngredientFactory;
import oik.designpatterns.factory.abstract_factory.pizza.Pizza;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory factory;

    public VeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + this.name);
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
        this.cheese = factory.createCheese();
        this.veggies = factory.createVeggies();
    }
}
