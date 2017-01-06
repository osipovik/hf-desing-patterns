package oik.designpatterns.factory.abstract_factory.pizza;

import oik.designpatterns.factory.abstract_factory.ingredient.cheese.Cheese;
import oik.designpatterns.factory.abstract_factory.ingredient.clams.Clams;
import oik.designpatterns.factory.abstract_factory.ingredient.dough.Dough;
import oik.designpatterns.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import oik.designpatterns.factory.abstract_factory.ingredient.sauce.Sauce;
import oik.designpatterns.factory.abstract_factory.ingredient.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;


    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Pizza";
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public Clams getClam() {
        return clam;
    }
}
