package oik.designpatterns.factory.abstract_factory;

import oik.designpatterns.factory.abstract_factory.ingredient.cheese.Cheese;
import oik.designpatterns.factory.abstract_factory.ingredient.clams.Clams;
import oik.designpatterns.factory.abstract_factory.ingredient.dough.Dough;
import oik.designpatterns.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import oik.designpatterns.factory.abstract_factory.ingredient.sauce.Sauce;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
