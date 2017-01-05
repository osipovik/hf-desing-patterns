package oik.designpatterns.factory.factory_method.chicago;

import oik.designpatterns.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style sauce and cheese pizza";
        dough = "Extra Thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded mozzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
