package oik.designpatterns.factory.abstract_factory.impl;

import oik.designpatterns.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import oik.designpatterns.factory.abstract_factory.ingredient.pepperoni.impl.SlicedPepperoni;
import oik.designpatterns.factory.abstract_factory.ingredient.sauce.impl.MarinaraSauce;
import oik.designpatterns.factory.abstract_factory.PizzaIngredientFactory;
import oik.designpatterns.factory.abstract_factory.ingredient.cheese.Cheese;
import oik.designpatterns.factory.abstract_factory.ingredient.cheese.impl.ReggianoCheese;
import oik.designpatterns.factory.abstract_factory.ingredient.clams.Clams;
import oik.designpatterns.factory.abstract_factory.ingredient.clams.impl.FreshClams;
import oik.designpatterns.factory.abstract_factory.ingredient.dough.Dough;
import oik.designpatterns.factory.abstract_factory.ingredient.dough.impl.ThinCrustDough;
import oik.designpatterns.factory.abstract_factory.ingredient.sauce.Sauce;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.*;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
