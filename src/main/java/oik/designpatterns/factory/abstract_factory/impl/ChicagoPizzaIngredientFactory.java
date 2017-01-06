package oik.designpatterns.factory.abstract_factory.impl;

import oik.designpatterns.factory.abstract_factory.PizzaIngredientFactory;
import oik.designpatterns.factory.abstract_factory.ingredient.cheese.Cheese;
import oik.designpatterns.factory.abstract_factory.ingredient.cheese.impl.Mozzarella;
import oik.designpatterns.factory.abstract_factory.ingredient.clams.Clams;
import oik.designpatterns.factory.abstract_factory.ingredient.clams.impl.FrozenClams;
import oik.designpatterns.factory.abstract_factory.ingredient.dough.Dough;
import oik.designpatterns.factory.abstract_factory.ingredient.dough.impl.ThickCrustDough;
import oik.designpatterns.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import oik.designpatterns.factory.abstract_factory.ingredient.pepperoni.impl.SlicedPepperoni;
import oik.designpatterns.factory.abstract_factory.ingredient.sauce.impl.PlumTomatoSauce;
import oik.designpatterns.factory.abstract_factory.ingredient.sauce.Sauce;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.Veggies;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.impl.BlackOlives;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.impl.EggPlant;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.impl.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
